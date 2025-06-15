package Easy_Selenium_Framework_Questions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Verify_successful_login_with_valid_credentials {
public WebDriver driver;
  @BeforeMethod
    public void launchApplication() {
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo");
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
    }
 @Test(priority = 1)
    public void verifyLoginWithValidCredentials() {
        driver.findElement(By.id("input-email")).sendKeys("HinaInam@outlook.com");
        driver.findElement(By.id("input-password")).sendKeys("Woodbridge123");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        boolean isLogoutVisible = driver.findElement(By.linkText("Logout")).isDisplayed();
        Assert.assertTrue(isLogoutVisible, "Login failed: Logout link not visible.");
    }
 @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}

