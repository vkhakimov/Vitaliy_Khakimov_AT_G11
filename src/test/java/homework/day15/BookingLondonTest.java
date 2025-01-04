package homework.day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BookingLondonTest {

    WebDriver driver;

    @BeforeTest
    public void initialize() {
        driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void londonTest() {
        WebElement acceptCookies = driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler"));
        acceptCookies.click();

        WebElement closeSignInWindow = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
        closeSignInWindow.click();

        WebElement whereToGoInput = driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
        whereToGoInput.sendKeys("London");

        WebElement firstSearchResult = driver.findElement(By.xpath("//div[text()='London']"));
        firstSearchResult.click();

        WebElement searchButton = driver.findElement(By.xpath("//button/span[text()='Search']"));
        searchButton.click();

        List<WebElement> cards = driver.findElements(By.cssSelector("[data-testid=property-card]"));
        WebElement tensResult = cards.get(9);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", tensResult);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", tensResult);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", tensResult);

        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filePath = "screenshot.png"; // This will save the screenshot in the root of your project
        File destinationFile = new File(filePath);

        try {
            FileUtils.copyFile(screenShot, destinationFile);
        } catch (IOException ex) {
            System.out.println("Screenshot copy error: " + ex);
        }
    }

    @AfterTest
    public void shutDown() {
        driver.quit();
    }
}
