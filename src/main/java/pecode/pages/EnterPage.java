package pecode.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class EnterPage extends Form {

    private ITextBox loginTextBox = getElementFactory().getTextBox(By.xpath("//input[@name='username']"),
            "Login Text Box");
    private ITextBox passwordTextBox = getElementFactory().getTextBox(By.xpath("//input[@name='password']"),
            "Password Text Box");
    private IButton loginButton = getElementFactory().getButton(By.xpath("//input[contains(@class, 'btn-success')]"),
            "Login Button");
    private String VALUE = "value";
    private ITextBox loginSpan = getElementFactory().getTextBox(By.xpath("//span[contains(text(), 'No account found with that username')]"),
            "Login span");

    public EnterPage() {
        super(By.xpath("//div[@class='wrapper']"), "Enter Page");
    }

    public void sendLogin(String login) {
        loginTextBox.sendKeys(login);
    }

    public void sendPassword(String password) {
        passwordTextBox.sendKeys(password);
    }

    public void clickOnLogin() {
        loginButton.clickAndWait();
    }

    public String getEnteredLogin() {
        return loginTextBox.getAttribute(VALUE);
    }

    public String getEnteredPassword() {
        return passwordTextBox.getAttribute(VALUE);
    }

    public boolean isLoginSpanDisplayed() {
        return loginSpan.state().isDisplayed();
    }
}
