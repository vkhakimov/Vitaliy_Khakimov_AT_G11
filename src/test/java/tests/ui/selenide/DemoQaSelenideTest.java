package tests.ui.selenide;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQaSelenideTest {

    @Test
    public void oldSelectTest() {
        open("https://demoqa.com/select-menu");
        $("#oldSelectMenu").selectOption(5);
    }

    @Test
    public void carsSelectTest() {
        open("https://demoqa.com/select-menu");
        $("#cars").selectOption("Audi");
    }
}
