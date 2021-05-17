package playground;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void goToWomensPage() {
        String title = driver.getTitle();
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/h2")).isDisplayed();
        Assert.assertEquals(title, "My Store");
    }

    @Test
    public void shareWishListTest() {
        registerNewUser();
        addProductToWishList();
        shareWishList();
    }

    public void registerNewUser() {
        String title = driver.getTitle();
        driver.findElement(By.xpath("//*[@id=\"header\"]//*[@class=\"skip-links\"]//*[@data-target-element=\"#header-account\"]")).click();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div[2]/a")).click();
        driver.findElement(By.name("firstname")).sendKeys("zan");
        driver.findElement(By.name("middlename")).sendKeys("keegan");
        driver.findElement(By.name("lastname")).sendKeys("hendricks");
        driver.findElement(By.name("middlename"));
        driver.findElement(By.name("email")).sendKeys("testmail" + RandomStringUtils.randomNumeric(7) + "@gmail.com");
        driver.findElement(By.name("password")).sendKeys("chelsea");
        driver.findElement(By.name("confirmation")).sendKeys("chelsea");
        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button")).click();
        Assert.assertEquals(title, "Home page");

    }

    public void addProductToWishList() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/ul/li[1]/a")).click();
    }

    public void shareWishList() {
        driver.findElement(By.xpath("//*[@id=\"wishlist-view-form\"]/div/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("chelslaguma@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("I love this tv we should buy it ");
        driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button")).click();
    }
}