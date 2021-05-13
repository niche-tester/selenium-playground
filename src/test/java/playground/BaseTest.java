package playground;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;


public class BaseTest {

    public WebDriver driver;

    String guru = "http://live.demoguru99.com/";

    @BeforeTest
    public void setBaseURL() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(guru);
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }

}
