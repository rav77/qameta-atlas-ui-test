package home.rav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import static home.rav.constants.Constants.WEBDRIVER_PATH;

public class DriverFactory {

    public enum Browser {
        CHROME, FIREFOX, OPERA
    }

    private DriverFactory() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver(Browser browser) {

        switch (browser) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", WEBDRIVER_PATH + "chromedriver");
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", WEBDRIVER_PATH + "geckodriver");
                driver = new FirefoxDriver();
                break;
            case OPERA:
                System.setProperty("webdriver.opera.driver", WEBDRIVER_PATH + "operadriver");
                driver = new OperaDriver();
                break;
            default:
                throw new WebDriverException("Unknown webdriver");
        }
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
