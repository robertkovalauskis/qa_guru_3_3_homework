package guru.qa.selenide.starter;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TinkoffTest {

  @Test
  void testDeposit(){
    open("http://tinkoff.ru");
    $(byText("Вклады")).closest("div").click();
    $("body").shouldHave(text("Рассчитайте доходность вклада"));

    $("[data-qa-file=Container]").$(byText("Сумма вклада")).sibling(0).$("input").setValue("80000");
    $("[data-qa-file=Container]").$(byText("Валюта")).sibling(0).click();
    $("[data-qa-file=Container]").$(byText("Валюта")).parent().parent().sibling(0).$(byText("Евро")).click();

    $("").hover();
    sleep(5000);


  }
}
