package home.rav.google.element;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface GoogleSearch extends AtlasWebElement {

    @FindBy(".//input[@name='q']")
    AtlasWebElement input();

    default AtlasWebElement clearInput() {
        input().clear();
        return input();
    }

}
