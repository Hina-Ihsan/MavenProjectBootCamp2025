package Difficult_Selenium_Framework_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // ✅ Initialize PageFactory
    }

    // ✅ Page elements using @FindBy
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountDropdown;

    @FindBy(linkText = "Login")
    WebElement loginLink;

    @FindBy(id = "input-email")
    WebElement emailField;

    @FindBy(id = "input-password")
    WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @FindBy(linkText = "My Account")
    WebElement myAccountLabel;

    // ✅ Actions
    public void navigateToLoginPage() {
        myAccountDropdown.click();
        loginLink.click();
    }

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public boolean isMyAccountDisplayed() {
        return myAccountLabel.isDisplayed();
    }
}
