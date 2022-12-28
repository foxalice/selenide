import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTest {
    @Test
    void successfulSearchTestJUnit5() {

        open("https://github.com/selenide/selenide");
        $("[data-tab-item=i5wiki-tab]").click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $(Selectors.byText("SoftAssertions")).click();
        $("div.markdown-body").shouldHave(Condition.text(" Using JUnit5 extend test class:"));
        
    }
}
