package guru.qa.selenide.starter;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfabankTest {
  @Test
  void testDeposit(){
    open("http://alfabank.ru");

    $("body").shouldHave(text("Частным лицам"));
    $(byText("Вклады")).click();
    $("body").shouldHave(text("Вклады и инвестиции"));
    $$(byText("Депозиты")).find(visible).click();
    $(".product-cell__row_recharged:not(.disabled)").$(".product-cell__cell-header").sibling(0).preceding(0).shouldHave(text("Победа"));

  }
}
