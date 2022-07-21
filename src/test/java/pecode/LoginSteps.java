package pecode;

import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import pecode.model.TestUser;
import pecode.pages.EnterPage;

public class LoginSteps {

    public static void loginStep(TestUser user) {
        EnterPage enterPage = new EnterPage();
        Assert.assertTrue(enterPage.state().waitForDisplayed(), "Enter Page is not open");

        enterPage.sendLogin(user.getUserName());
        Assert.assertEquals(user.getUserName(), enterPage.getEnteredLogin(), "Entered login is not correct");

        enterPage.sendPassword(user.getPassword());
        Assert.assertEquals(user.getPassword(), enterPage.getEnteredPassword(), "Entered password is not correct");

        enterPage.clickOnLogin();
        Assert.assertFalse(enterPage.isLoginSpanDisplayed(), "No account found with that username");
    }
}
