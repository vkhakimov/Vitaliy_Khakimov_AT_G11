package tests.ui;

import driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.Utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BookingParisTest {

    WebDriver driver = WebDriverSingleton.getDriver();
    LocalDate currentDate = LocalDate.now();

    @BeforeTest
    public void initialize() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.booking.com/");
    }

    @Test
    public void parisTest() {
        HomePage homePage = new HomePage();
        Utils utils = new Utils();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        utils.acceptCookies();
        utils.closeSignInWindow();

        homePage.enterDestination("London");

        String startDate = utils.getDateFrom(currentDate, 3);
        LocalDate parsedStartDate = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("d MMMM yyyy"));
        String endDate = utils.getDateFrom(parsedStartDate, 7);
        homePage.setStartEndDate(startDate, endDate);

        homePage.addGuestsAndRooms(2, 1);

        homePage.clickSearch();

        try {
            searchResultsPage.select5Stars();
        } catch (StaleElementReferenceException ex) {
            searchResultsPage.select5Stars();
        }

        try {
            searchResultsPage.clickSortingOptions();
        } catch (StaleElementReferenceException ex) {
            searchResultsPage.clickSortingOptions();
        }

        searchResultsPage.clickRatingAscSorting();

        utils.waitForLoader(5);

        List<WebElement> stars = driver.findElements(By.xpath("//div[./h3]/div/span/div"));
        String rating = stars.getFirst().getAttribute("aria-label");
        Assert.assertEquals(rating, "1 out of 5", "Wrong rating!");
    }

    @AfterTest
    public void shutDown() {
        driver.quit();
    }
}
