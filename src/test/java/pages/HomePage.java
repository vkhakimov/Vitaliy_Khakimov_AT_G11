package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage extends BasePage {

    private By whereToGoInputXpath = By.xpath("//input[@placeholder='Where are you going?']");

    private By searchButtonXpath = By.xpath("//button/span[text()='Search']");

    private By guestsCss = By.cssSelector("[data-testid=occupancy-config]");

    private By plusAdultXpath = By.xpath("//div[@data-testid='occupancy-popup']/div/div[1]//button[@tabindex='-1'][2]");

    private By plusRoomXpath = By.xpath("//div[@data-testid='occupancy-popup']/div/div[3]//button[@tabindex='-1'][2]");

    private By doneButtonXpath = By.xpath("//button/span[text()='Done']");

    public void enterDestination(String destination) {
        WebElement whereToGoInput = driver.findElement(whereToGoInputXpath);
        whereToGoInput.sendKeys(destination);
        WebElement firstSearchResult = driver.findElement(By.xpath("//div[text()='" + destination + "']"));
        firstSearchResult.click();
    }

    public void setStartEndDate(String startDate, String endDate) {
        WebElement startDay = driver.findElement(By.xpath(String.format("//span[@aria-label='%s']", startDate)));
        WebElement endDay = driver.findElement(By.xpath(String.format("//span[@aria-label='%s']", endDate)));
        startDay.click();
        endDay.click();
    }

    public void addGuestsAndRooms(int numberOfGuests, int numberOfRooms) {
        WebElement guests = driver.findElement(guestsCss);
        guests.click();

        WebElement adultsPlus = driver.findElement(plusAdultXpath);
        WebElement roomsPlus = driver.findElement(plusRoomXpath);
        WebElement doneButton = driver.findElement(doneButtonXpath);

        for (int i = 0; i < numberOfGuests; i++) {
            adultsPlus.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }

        for (int i = 0; i < numberOfRooms; i++) {
            roomsPlus.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        }

        doneButton.click();
    }

    public void clickSearch() {
        WebElement searchButton = driver.findElement(searchButtonXpath);
        searchButton.click();
    }
}
