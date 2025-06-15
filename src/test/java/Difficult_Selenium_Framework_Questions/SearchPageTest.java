package Difficult_Selenium_Framework_Questions;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
				public class SearchPageTest {
				WebDriver driver;
				@BeforeMethod
				public void setUp() {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://tutorialsninja.com/demo");
	    }
				@Test
				public void verifySearchFunctionality() {
				SearchPage searchPage = new SearchPage(driver);
				searchPage.searchForProduct("MacBook");
				Assert.assertTrue(searchPage.macbookLink.isDisplayed(), "Search result not displayed!");
				searchPage.clickOnProduct();
				String productTitle = driver.getTitle();
				Assert.assertTrue(productTitle.contains("MacBook"), "Not navigated to product detail page!");
	    }
				@AfterMethod
				public void tearDown() {
				driver.quit();
	    }
	}


