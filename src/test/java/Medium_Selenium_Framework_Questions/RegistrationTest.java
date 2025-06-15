package Medium_Selenium_Framework_Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
public class RegistrationTest {
 WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
  @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
    }
  @Test
    public void verifySuccessfulRegistration() {
        RegistrationPage regPage = new RegistrationPage(driver);
        regPage.goToRegistrationPage();
        regPage.fillRegistrationForm("Henna", "Inam", "henna.inam101@outlook.com", "3019060225", "Henna@123");
        regPage.submitForm();
        softAssert.assertTrue(regPage.successMessage.isDisplayed(), "Registration was not successful!");
        softAssert.assertAll();
    }
@AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

