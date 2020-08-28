package home.rav;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

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
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case OPERA:
                WebDriverManager.operadriver().setup();
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
