package Easy_Selenium_Framework_Questions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verify_Navigation_Simple {
	WebDriver driver;
@BeforeMethod
	public void openWebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}
@Test
	public void checkMacPageElements() { // Navigate to Mac page
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();
		boolean headingIsVisible = driver.findElement(By.xpath("//h2[text()='Mac']")).isDisplayed(); 
		Assert.assertTrue(headingIsVisible, "Mac heading not found");
		boolean productIsVisible = driver.findElement(By.linkText("iMac")).isDisplayed();
		Assert.assertTrue(productIsVisible, "iMac not found on page");
	}
@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
