package home.rav;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.not;

public class GoogleSearchTest extends TestBase {

    @Test
    @DisplayName("Поиск в Google")
    void test1() throws InterruptedException {

        /** не работает
         * Зачем на каждом шаге вызывать atlas.create(driver, page) ?
         * */
//        onSite.onGooglePage().open();
//        onSite.onGooglePage().input().sendKeys("qameta atlas");
//        onSite.onGooglePage().input().submit();
//        Thread.sleep(2000);


        steps.searchInGoogle("Погода").results().should(not(empty()));
        Thread.sleep(1000);

        steps.reSearchInGoogle("втб24")
                .results()
                .waitUntil(not(empty()))
                .filter(a -> a.getAttribute("href").contains("vtb24"))
                .waitUntil(not(empty()))
                .get(0)
                .click();
        Thread.sleep(2000);

    }
}
