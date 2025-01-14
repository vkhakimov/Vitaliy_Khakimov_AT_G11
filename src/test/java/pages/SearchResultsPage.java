package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage extends BasePage {

    private By cardXpath = By.cssSelector("[data-testid=property-card]");

    private By fiveStartXpath = By.xpath("(//div[./input[contains(@aria-label, '5 stars')]]/label)[1]");

    private By sortingOptionsXpath = By.cssSelector("[data-testid='sorters-dropdown-trigger']");

    private By ratingAscXpath = By.xpath("//span[text()='Property rating (low to high)']");

    public WebElement getSearchResultByIndex(int i) {
        List<WebElement> cards = driver.findElements(cardXpath);
        return cards.get(i);
    }

    public void select5Stars() {
        WebElement fiveStars = driver.findElement(fiveStartXpath);
        fiveStars.click();
    }

    public void clickSortingOptions() {
        WebElement sorterDropdown = driver.findElement(sortingOptionsXpath);
        sorterDropdown.click();
    }

    public void clickRatingAscSorting() {
        WebElement sortOptionRatingDesc = driver.findElement(ratingAscXpath);
        sortOptionRatingDesc.click();
    }
}
