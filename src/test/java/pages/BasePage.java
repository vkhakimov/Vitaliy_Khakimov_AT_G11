package pages;

import driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver = WebDriverSingleton.getDriver();
}
