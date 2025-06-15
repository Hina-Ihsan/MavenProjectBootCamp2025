package Difficult_Selenium_Framework_Questions;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.BaseTest;
import Utilities.TestListener;

@Listeners(TestListener.class)

 // ✅ Hook your listener here
public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.navigateToLoginPage();
        loginPage.login("henna.inam101@outlook.com", "Henna@123");

        boolean isLoginSuccessful = loginPage.isMyAccountDisplayed();
        Assert.assertTrue(isLoginSuccessful, "Login failed – My Account not visible");
    }
}


