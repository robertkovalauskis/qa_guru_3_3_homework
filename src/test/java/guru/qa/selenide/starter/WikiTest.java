package guru.qa.selenide.starter;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WikiTest {

  //@Test
  @RepeatedTest(10)
  void doubleLocator(){
    if (Math.random()>0.5){
      open("https://wiktionary.org");
    }else{
      open("https://wikibooks.org");
    }
    // допустим, что указатель на главную иногда имеет локатор div.lang4[lang=de],
    // а иногда div.lang7[lang=de]
    $("div.lang4[lang=de],div.lang7[lang=de]").click();
    $("body").shouldHave(text("Hauptseite"));
  }
}
