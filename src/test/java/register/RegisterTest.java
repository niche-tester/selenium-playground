package register;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ProfilePage;
import pages.RegisterPage;
import static  org.testng.Assert.assertTrue;

public class RegisterTest extends BaseTests  {
    @Test
    public void testRegisterSuccessful(){
        RegisterPage registerPage = homePage.clickRegisterLink();
        registerPage.setFirstName("Garry");
        registerPage.setMiddleName("Ole");
        registerPage.setLastName("Livens");
        registerPage.setEmailAddress("garry@gmail.com");
        registerPage.setPassword1("SuperPassword45");
        registerPage.setPassword2("SuperPassword45");
        ProfilePage profilePage = registerPage.clickRegister();
        assertTrue(profilePage.getSuccessMessage().contains("Thank you for registering with Main Website Store."),
                "Alert Text is incorrect");

    }
}
