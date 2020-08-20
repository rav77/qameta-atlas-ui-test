package home.rav.steps;

import home.rav.google.page.GoogleSearchPage;
import home.rav.google.page.GoogleResultsPage;
import io.qameta.allure.Step;
import io.qameta.atlas.core.Atlas;
import org.openqa.selenium.WebDriver;

import static home.rav.constants.Constants.Google.GOOGLE_URL;

public class GoogleSteps extends BaseSteps {

    public GoogleSteps(Atlas atlas, WebDriver driver) {
        super(atlas, driver);
    }

    @Step("Поиск в google")
    public GoogleResultsPage searchInGoogle(String query) {
        GoogleSearchPage googleSearchPage = onPage(GoogleSearchPage.class);
        googleSearchPage.open(GOOGLE_URL);
        googleSearchPage.googleSearch().input().sendKeys(query);
        onPage(GoogleSearchPage.class).googleSearch().input().submit();
        return onPage(GoogleResultsPage.class);
    }

    @Step("Повторный поиск в google")
    public GoogleResultsPage reSearchInGoogle(String query) {
        GoogleResultsPage googleResultsPage = onPage(GoogleResultsPage.class);
        googleResultsPage.googleSearch().clearInput().sendKeys(query);
        googleResultsPage.googleSearch().input().submit();
        return onPage(GoogleResultsPage.class);
    }

}
