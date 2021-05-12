package base;
import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    //declare web driver property
    protected  WebDriver driver;
    protected  HomePage homePage;


    //run the setup method before any test is done
    @BeforeClass
    public  void setUp(){
        //Set system properties
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //instantiate web driver
        driver = new ChromeDriver();

        //go to base url
        driver.get("http://live.demoguru99.com/");
        homePage = new HomePage(driver);

    }
     @AfterClass
    public  void tearDown(){
        driver.quit();
    }

}
