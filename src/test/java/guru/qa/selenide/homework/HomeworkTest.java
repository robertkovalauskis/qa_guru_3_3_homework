package guru.qa.selenide.homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeworkTest {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void countOfDeposits() {

        open("https://alfabank.ru/make-money/");

        $x("//a[@href='/make-money/deposits/']/button").click();
        $$(byText("Депозиты")).find(visible).parent().click();
        $("#more-buttons").scrollTo().shouldHave(text("Архивные счета и депозиты")).click();
        $$(byText("Депозиты")).find(visible).parent().click();

        $("div[class='']").findAll("div[data-widget-name=\"CatalogCard\"]").shouldHaveSize(5);
    }


}
