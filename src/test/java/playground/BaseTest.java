package playground;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;


public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setBaseURL() {
        FirefoxOptions capabilities = new FirefoxOptions();
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(capabilities);
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }


}
