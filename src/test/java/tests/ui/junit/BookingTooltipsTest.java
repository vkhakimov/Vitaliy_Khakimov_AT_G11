package tests.ui.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class BookingTooltipsTest {
    WebDriver driver;

    @Before
    public void initialize() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.booking.com/");
    }

    @Test
    public void actionsTest() {
        WebElement acceptCookies = driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler"));
        acceptCookies.click();

        WebElement closeSignInWindow = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']"));
        closeSignInWindow.click();

        WebElement currencyIndicator = driver.findElement(By.cssSelector("[data-testid=header-currency-picker-trigger]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(currencyIndicator);
        actions.perform();

        WebElement currencyTooltip = driver.findElement(By.id(":r0:"));
        String currencyTooltipText = currencyTooltip.getText().toLowerCase();
        Assert.assertEquals(currencyTooltipText, "select your currency", "Text doesn't match");

        WebElement languageIndicator = driver.findElement(By.cssSelector("[data-testid=header-language-picker-trigger]"));
        actions.moveToElement(languageIndicator);
        actions.perform();

        WebElement languageTooltip = driver.findElement(By.id(":r6:"));
        String languageTooltipText = languageTooltip.getText().toLowerCase();
        assertEquals(languageTooltipText, "select your language", "Text doesn't match");
    }

    @After
    public void shutDown() {
        driver.quit();
    }
}
