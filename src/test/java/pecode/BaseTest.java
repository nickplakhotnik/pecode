package pecode;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.logging.Logger;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pecode.configuration.Configuration;
import pecode.model.TestUser;
import pecode.utils.FileSaved;

public class BaseTest {

    protected Logger logger = AqualityServices.getLogger();
    protected TestUser user = new TestUser(new JsonSettingsFile("user.json"));

    @BeforeMethod
    public void beforeMethod() {
        AqualityServices.getBrowser().maximize();
        AqualityServices.getBrowser().goTo(Configuration.getStartUrl());
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) {
        if(!testResult.isSuccess()) {
            FileSaved.screenshotSaved(AqualityServices.getBrowser().getScreenshot(), testResult.getName());
        }
        AqualityServices.getBrowser().quit();
    }
}
