package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.test.automationexercise.utils.ConfigReader;

public class BaseTest {

    protected WebDriver driver;
    private ConfigReader config = new ConfigReader();

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver(getChromeOptions());
        driver.get(config.getBaseUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito", "--disable-popup-blocking");
        return options;
    }
}
