package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils extends BasePage {

    private By acceptCookiesCss = By.cssSelector("button#onetrust-accept-btn-handler");

    private By closeSignInWindowXpath = By.xpath("//button[@aria-label='Dismiss sign in information.']");

    public void acceptCookies() {
        WebElement acceptCookies = driver.findElement(acceptCookiesCss);
        acceptCookies.click();
    }

    public void closeSignInWindow() {
        WebElement closeSignInWindow = driver.findElement(closeSignInWindowXpath);
        closeSignInWindow.click();
    }

    public void paintElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", element);
    }

    public void screenShot() {
        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filePath = "screenshot.png"; // This will save the screenshot in the root of your project
        File destinationFile = new File(filePath);

        try {
            FileUtils.copyFile(screenShot, destinationFile);
        } catch (IOException ex) {
            System.out.println("Screenshot copy error: " + ex);
        }
    }

    public static String getDateFrom(LocalDate from, int offset) {
        LocalDate date = from.plusDays(offset);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        String formattedDate = date.format(formatter);

        return formattedDate;
    }

    public void waitForLoader(int time) {
        new WebDriverWait(driver, Duration.ofSeconds(time)).until(
                ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[data-testid=skeleton-loader]"))
        );
    }
}
