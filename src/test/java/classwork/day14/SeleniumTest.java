package classwork.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class SeleniumTest {
    public static String getTomorrowDayOfWeek() {
        LocalDate currentDate = LocalDate.now();

        LocalDate tomorrow = currentDate.plusDays(1);

        DayOfWeek dayOfWeek = tomorrow.getDayOfWeek();

        return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        String tomorrowDay = getTomorrowDayOfWeek();

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://google.com");

        WebElement acceptAll = webDriver.findElement(By.xpath("//button/div[text()='Accept all']"));
        acceptAll.click();

        WebElement searchInput = webDriver.findElement(By.xpath("//textarea[@role='combobox']"));
        searchInput.sendKeys("погода минск");

        Thread.sleep(500);
        WebElement firstSearchResult = webDriver.findElement(By.xpath("(//div[@role='option']/div)[1]"));
        firstSearchResult.click();

        WebElement weatherTomorrow = webDriver.findElement(By.xpath("//div[@data-wob-di='1']"));
        weatherTomorrow.click();

        String tomorrowDayTwelvePMXPath = String.format("//*[contains(@aria-label, '°Celsius %s 12:00')][1]", tomorrowDay);
        Thread.sleep(500);
        WebElement tomorrowDayTwelvePM = webDriver.findElement(By.xpath(tomorrowDayTwelvePMXPath));
        String ariaLabelText = tomorrowDayTwelvePM.getDomAttribute("aria-label");
        System.out.println(ariaLabelText);
        webDriver.quit();
    }
}
