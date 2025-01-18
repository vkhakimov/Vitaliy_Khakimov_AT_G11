package tests.ui.junit;

import driver.WebDriverSingleton;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.Utils;

import java.time.Duration;

public class BookingLondonTest {

    WebDriver driver = WebDriverSingleton.getDriver();

    @Before
    public void initialize() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.booking.com/");
    }

    @Test
    public void londonTest() {
        HomePage homePage = new HomePage();
        Utils utils = new Utils();
        SearchResultsPage searchResultsPage = new SearchResultsPage();

        utils.acceptCookies();
        utils.closeSignInWindow();
        homePage.enterDestination("London");
        homePage.clickSearch();
        utils.paintElement(searchResultsPage.getSearchResultByIndex(9));
        utils.screenShot();
    }

    @Before
    public void shutDown() {
        driver.quit();
    }
}
