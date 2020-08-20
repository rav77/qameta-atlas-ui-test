package home.rav.google.site;

import home.rav.google.page.GoogleSearchPage;
import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;

public interface GoogleSite extends WebSite {

//    @Page
//    GoogleSearchPage onGoogleSearchPage();
//
//    @Page(url = "search")
//    GoogleResultsPage onGoogleResultsPage();

//    @Page(url = "https://www.google.com")
    @Page
    GoogleSearchPage onGoogleSearchPage();
}
