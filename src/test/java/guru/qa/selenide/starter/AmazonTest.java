package guru.qa.selenide.starter;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class AmazonTest {
  @Test
  public void openPage() {
      open("http://amazon.com");
      sleep(5000);
  }
}