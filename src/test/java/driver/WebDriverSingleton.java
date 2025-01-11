package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Collections;
import java.util.Optional;

public class WebDriverSingleton {
    //    private static WebDriverSingleton instance;
    private static WebDriver driver;

    protected static Config config = Optional.ofNullable(System.getProperty("CONFIG")).isEmpty() ?
            Config.CHROME : Config.valueOf(System.getProperty("CONFIG"));

    private WebDriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (null == driver) {
            driver = getWebDriver();
        }
        return driver;
    }

    private static WebDriver getWebDriver() {
        return switch (config) {
            case FF -> getFFDriver();
            case REMOTE -> getRemoteDriver();
            default -> getChromeDriver();
        };
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("start-maximized");
        caps.addArguments("disable-infobars");
        caps.setExperimentalOption("excludeSwitches",
                Collections.singletonList("enable-automation"));
        return new ChromeDriver(caps);
    }

    private static WebDriver getFFDriver() {
        //TODO
        return new FirefoxDriver();
    }

    private static WebDriver getRemoteDriver() {
        //TODO
        return new FirefoxDriver();
    }

    public enum Config {
        CHROME, FF, REMOTE
    }
}
