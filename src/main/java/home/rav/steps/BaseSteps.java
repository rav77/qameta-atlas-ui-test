package home.rav.steps;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebPage;
import org.openqa.selenium.WebDriver;

public abstract class BaseSteps {

    protected Atlas atlas;
    protected WebDriver driver;

    public BaseSteps(Atlas atlas, WebDriver driver) {
        this.atlas = atlas;
        this.driver = driver;
    }

    protected  <T extends WebPage> T onPage(Class<T> page) {
        return atlas.create(driver, page);
    }
}
