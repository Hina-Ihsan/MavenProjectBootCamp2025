package Easy_Selenium_Framework_Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class verify_the_title_of_the_page {
    WebDriver driver;
  @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo");
    }
 @Test
    public void verifyPageTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Your Store";

        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
