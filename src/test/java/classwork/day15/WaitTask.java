package classwork.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WaitTask {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.booking.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement acceptCookies = driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler"));
        acceptCookies.click();

        WebElement closeSignInWindow = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
        closeSignInWindow.click();

        WebElement whereToGoInput = driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
        whereToGoInput.sendKeys("Paris");

        WebElement firstSearchResult = driver.findElement(By.xpath("//div[text()='Paris']"));

        firstSearchResult.click();

        WebElement startDay = driver.findElement(By.xpath("//span[@aria-label='24 December 2024']"));
        WebElement endDay = driver.findElement(By.xpath("//span[@aria-label='31 December 2024']"));

        startDay.click();
        endDay.click();

        WebElement guests = driver.findElement(By.cssSelector("[data-testid=occupancy-config]"));
        guests.click();

        WebElement adultsPlus = driver.findElement(By.xpath("//div[@data-testid='occupancy-popup']/div/div[1]//button[@tabindex='-1'][2]"));
        WebElement roomsPlus = driver.findElement(By.xpath("//div[@data-testid='occupancy-popup']/div/div[3]//button[@tabindex='-1'][2]"));

        adultsPlus.click();
        adultsPlus.click();
        roomsPlus.click();

        WebElement doneButton = driver.findElement(By.xpath("//button/span[text()='Done']"));
        doneButton.click();

        WebElement searchButton = driver.findElement(By.xpath("//button/span[text()='Search']"));
        searchButton.click();

        try {
            WebElement fiveStars = driver.findElement(By.xpath("(//input[contains(@aria-label, '5 stars')])[1]"));
            fiveStars.click();
        } catch (StaleElementReferenceException ex) {
            WebElement fiveStars = driver.findElement(By.xpath("(//input[contains(@aria-label, '5 stars')])[1]"));
            fiveStars.click();
        }

        WebElement sorterDropdown = driver.findElement(By.cssSelector("[data-testid='sorters-dropdown-trigger']"));
        sorterDropdown.click();

        WebElement sortOptionRatingDesc = driver.findElement(By.xpath("//span[text()='Property rating (low to high)']"));
        sortOptionRatingDesc.click();

        WebElement loader = driver.findElement(By.cssSelector("[data-testid=skeleton-loader]"));
        driver.quit();
    }
}
