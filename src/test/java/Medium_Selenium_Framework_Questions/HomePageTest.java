package Medium_Selenium_Framework_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class HomePageTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo");
    }

    @Test
    public void verifyHomePageElementsAndNavigation() {
        HomePage homePage = new HomePage(driver);

        // Verify logo and search box are visible
        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed!");
        Assert.assertTrue(homePage.isSearchBoxDisplayed(), "Search box is not displayed!");

        // Navigate to Laptops
        homePage.clickLaptopsLink();

        // Optional: Add assertion for URL or header text
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("path=18"), "Navigation to Laptops page failed!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

