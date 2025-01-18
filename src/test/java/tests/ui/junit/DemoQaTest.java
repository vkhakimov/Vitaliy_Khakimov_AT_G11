package tests.ui.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DemoQaTest {
    WebDriver driver;

    @Before
    public void initialize() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/select-menu");
    }

    @org.junit.Test
    public void oldSelectTest() {
        WebElement element = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(element);
        select.selectByValue("5");
    }

    @Test
    public void carsSelectTest() {
        WebElement element = driver.findElement(By.id("cars"));

        Select select = new Select(element);
        select.selectByValue("audi");
    }

    @After
    public void shutDown() {
        driver.quit();
    }
}
