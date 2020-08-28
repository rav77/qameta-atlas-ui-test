package home.rav;

import home.rav.listener.AtlasAllureListener;
import home.rav.steps.GoogleSteps;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static home.rav.DriverFactory.Browser.*;
import static home.rav.DriverFactory.getDriver;

public class TestBase {

    protected WebDriver driver;
    protected Atlas atlas;
    protected GoogleSteps steps;

    @BeforeEach
    void setUp() {
        driver = getDriver(CHROME);
        driver.manage().window().maximize();
        atlas = new Atlas(new WebDriverConfiguration(driver)).listener(new AtlasAllureListener());
        steps = new GoogleSteps(atlas, driver);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

}
