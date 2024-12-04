package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ConfigReader;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_java\\eclipse-workspace\\sele1\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        //Fetching URL from config file
        String baseURL = ConfigReader.getProperty("baseURL");
        driver.get(baseURL);
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
