package Medium_Selenium_Framework_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "My Account")
    WebElement myAccountLink;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(id = "input-firstname")
    WebElement firstName;

    @FindBy(id = "input-lastname")
    WebElement lastName;

    @FindBy(id = "input-email")
    WebElement email;
@FindBy(id = "input-telephone")
    WebElement telephone;
@FindBy(id = "input-password")
    WebElement password;
@FindBy(id = "input-confirm")
    	WebElement confirmPassword;
    	@FindBy(name = "agree")
    	WebElement privacyPolicy;
    	@FindBy(css = "input.btn.btn-primary")
    	WebElement continueButton;
    	@FindBy(css = "#content > p")
    	public WebElement successMessage;
    	public void goToRegistrationPage() {
        myAccountLink.click();
        registerLink.click();
    }
    	public void fillRegistrationForm(String fname, String lname, String emailAddr, String phone, String pass) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        email.sendKeys(emailAddr);
        telephone.sendKeys(phone);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);
    }
    	public void submitForm() {
        privacyPolicy.click();
        continueButton.click();
    }
}
