package driverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDrivers {

    public static WebDriver getDriver(DriverManagerType browserName) {
        switch (browserName.getDriver().toLowerCase()) {
            case "chromedriver":
                ChromeOptions chromeOptions = new ChromeOptions();
                // chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--disable-notifications");
                return new ChromeDriver();

            case "firefoxdriver":
                return new FirefoxDriver();

            case "iedriver":
                return new InternetExplorerDriver();

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserName.getDriver());
        }
    }
}
