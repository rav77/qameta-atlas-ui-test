package home.rav.google.layout;

import home.rav.google.element.GoogleSearch;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithGoogleSearch {

    @FindBy("//form[@id='tsf']")
    GoogleSearch googleSearch();
}
