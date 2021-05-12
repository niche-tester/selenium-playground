package playground;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class BaseTest {

    public WebDriver driver;

    @BeforeTest
    public void setBaseURL() {
        FirefoxOptions capabilities = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(capabilities);
        driver.get("http://live.demoguru99.com/");
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }

}
