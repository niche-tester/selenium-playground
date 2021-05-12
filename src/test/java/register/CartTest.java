package register;
import static org.testng.Assert.assertTrue;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTests {

    @Test
    public void addTvToCartTest (){
        LoginPage loginPage = homePage.loginIntoAccount();
        loginPage.fillUsername("tomcollindoe@gmail.com");
        loginPage.fillPassword("SuperPassword45");
        ProfilePage profilePage = loginPage.clickLoginButton();

        TvPage tvPage = profilePage.clickTvLink();
        CartPage cartPage = tvPage.addTvToWishlist();
        SharePage sharePage = cartPage.clickShareWishlist();
        sharePage.fillEmailField("philani@gmail.com");
        sharePage.fillMessageField("You have been award a free gift");
        CartPage profilePage1 = sharePage.clickShareButton();
        assertTrue(profilePage1.getSuccessMessage().contains("Your Wishlist has been shared."));

    }

}
