package homework.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoQaTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void initialize() {
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
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

    @AfterTest
    public void shutDown() {
        driver.quit();
    }
}
