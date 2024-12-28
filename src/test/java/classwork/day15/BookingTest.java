package classwork.day15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BookingTest {

    WebDriver driver;
    LocalDate currentDate = LocalDate.now();

    public static String getDateFrom(LocalDate from, int offset) {
        LocalDate date = from.plusDays(offset);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        String formattedDate = date.format(formatter);

        return formattedDate;
    }

    @Before
    public void initialize() {
        driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void parisTest() {
        WebElement acceptCookies = driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler"));
        acceptCookies.click();

        WebElement closeSignInWindow = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
        closeSignInWindow.click();

        WebElement whereToGoInput = driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
        whereToGoInput.sendKeys("Paris");

        WebElement firstSearchResult = driver.findElement(By.xpath("//div[text()='Paris']"));
        firstSearchResult.click();

        String startDate = getDateFrom(currentDate, 3);
        LocalDate parsedStartDate = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("d MMMM yyyy"));
        String endDate = getDateFrom(parsedStartDate, 7);
        WebElement startDay = driver.findElement(By.xpath(String.format("//span[@aria-label='%s']", startDate)));
        WebElement endDay = driver.findElement(By.xpath(String.format("//span[@aria-label='%s']", endDate)));
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
            WebElement fiveStars = driver.findElement(By.xpath("(//div[./input[contains(@aria-label, '5 stars')]]/label)[1]"));
            fiveStars.click();
        } catch (StaleElementReferenceException ex) {
            WebElement fiveStars = driver.findElement(By.xpath("(//div[./input[contains(@aria-label, '5 stars')]]/label)[1]"));
            fiveStars.click();
        }

        try {
            WebElement sorterDropdown = driver.findElement(By.cssSelector("[data-testid='sorters-dropdown-trigger']"));
            sorterDropdown.click();
        } catch (StaleElementReferenceException ex) {
            WebElement sorterDropdown = driver.findElement(By.cssSelector("[data-testid='sorters-dropdown-trigger']"));
            sorterDropdown.click();
        }

        WebElement sortOptionRatingDesc = driver.findElement(By.xpath("//span[text()='Property rating (low to high)']"));
        sortOptionRatingDesc.click();

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[data-testid=skeleton-loader]"))
        );

        List<WebElement> stars = driver.findElements(By.xpath("//div[./h3]/div/span/div"));
        String rating = stars.getFirst().getAttribute("aria-label");
        Assert.assertEquals("Wrong rating!", rating, "1 out of 5");
    }

    @After
    public void shutDown() {
        driver.quit();
    }
}
