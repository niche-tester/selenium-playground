package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest {
    private WebDriver driver;
    public void setUp() {
        //specifying that we are using chrome
        //indicating where the chromedriver.exe is(in this case i have moved it to the resource folder)
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //telling the driver to get the link of the webpage you want to test
        driver.get("https://gk-rn-spa-staging.azurewebsites.net/signup");
        // provide us with methods that will allow us to manage the window
        //if you want to view it in mobile view ..
        // driver.manage().window().setSize(new Dimension(width:height);
        driver.manage().window().maximize();
        //just to check if driver is actually fetching out website...we ask driver to print the title(name) of the site
        // in the terminal.
        System.out.println(driver.getTitle());
        //this is to close the webpage completly
        driver.quit();
    }
    //to run our page
    public static void main(String arg[]){
        BaseTest test = new BaseTest();
        test.setUp();
    }
}