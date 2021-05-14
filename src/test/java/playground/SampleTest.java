package playground;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void sharedRegUserWishList() {
        regUserTest();
        wishListTest();
    }

    public void regUserTest() {

        driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a")).click();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.className("buttons-set")).click();
        driver.findElement(By.id("firstname")).sendKeys("firstNameTest");
        driver.findElement(By.id("middlename")).sendKeys("middleNameTest");
        driver.findElement(By.id("lastname")).sendKeys("lastNameTest");
        driver.findElement(By.id("email_address")).sendKeys("testmail" +
                RandomStringUtils.randomNumeric(9) + "@gmail" + ".com");
        driver.findElement(By.id("password")).sendKeys("passwordTest");
        driver.findElement(By.id("confirmation")).sendKeys("passwordTest");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/button")).click();
    }

    public void wishListTest() {
        String title = driver.getTitle();
        driver.findElement(By.className("level0")).click();
        driver.findElement(By.className("link-wishlist")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/div/button[1]")).click();
        driver.findElement(By.id("email_address")).sendKeys("test" + RandomStringUtils.randomNumeric(8) + "@gmail.com");
        driver.findElement(By.id("message")).sendKeys("testing text");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div[2]/button/span/span")).click();
    }
}

