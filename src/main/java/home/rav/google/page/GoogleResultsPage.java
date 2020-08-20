package home.rav.google.page;

import home.rav.google.layout.WithGoogleSearch;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface GoogleResultsPage extends WebPage, WithGoogleSearch {

    @FindBy("//div[@class='rc']/div[@class='r']/a")
    ElementsCollection<AtlasWebElement> results();
}
