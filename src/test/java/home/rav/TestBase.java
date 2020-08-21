package home.rav;

import home.rav.listener.AtlasAllureListener;
import home.rav.steps.GoogleSteps;
import io.qameta.allure.Allure;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TestBase {

    protected WebDriver driver;
    protected Atlas atlas;
    protected GoogleSteps steps;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        atlas = new Atlas(new WebDriverConfiguration(driver)).listener(new AtlasAllureListener());
        steps = new GoogleSteps(atlas, driver);
    }

    @AfterEach
    void tearDown() throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Allure.addAttachment("Screenshot", FileUtils.openInputStream(screenshot));
        driver.quit();
    }

}
