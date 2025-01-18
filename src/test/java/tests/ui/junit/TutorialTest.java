package tests.ui.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class TutorialTest {
    WebDriver driver;

    @Before
    public void initialize() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void tutorialTest() {
        driver.get("https://www.w3schools.com/java/");
        WebElement acceptCookies = driver.findElement(By.id("accept-choices"));
        acceptCookies.click();

        WebElement tutorial = driver.findElement(By.cssSelector("span.color_h1"));

        Actions action = new Actions(driver);
        action
                .doubleClick(tutorial)
                .keyDown(Keys.COMMAND)
                .sendKeys("c")
                .keyUp(Keys.COMMAND)
                .build()
                .perform();

        driver.get("https://google.com");

        WebElement acceptAll = driver.findElement(By.xpath("//button/div[text()='Accept all']"));
        acceptAll.click();

        WebElement searchInput = driver.findElement(By.xpath("//textarea[@role='combobox']"));

        action
                .click(searchInput)
                .keyDown(Keys.COMMAND)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .build()
                .perform();

        action
                .keyDown(Keys.RETURN)
                .build()
                .perform();

        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@id='rso']/div//h3"));

        assertTrue(searchResults.stream()
                .map(WebElement::getText)
                .map(String::toLowerCase)
                .allMatch(el -> el.contains("tutorial")));
    }

    @After
    public void shutDown() {
        driver.quit();
    }
}
