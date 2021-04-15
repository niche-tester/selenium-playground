package playground;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest{

    @Test
    public void goToWomensPage() {
        String title = driver.getTitle();
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/h2")).isDisplayed();
        Assert.assertEquals(title, "My Store");
    }

}

