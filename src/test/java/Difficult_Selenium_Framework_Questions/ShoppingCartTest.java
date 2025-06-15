package Difficult_Selenium_Framework_Questions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ShoppingCartTest {
 WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo");
        driver.findElement(By.linkText("MacBook")).click();
        Thread.sleep(2000); // Just to allow page load
    }
    @Test
    public void verifyProductAddedToCart() throws InterruptedException {
        ShoppingCartPage cartPage = new ShoppingCartPage(driver);
        cartPage.addProductToCart();
        Thread.sleep(2000); // Allow time for cart update
        cartPage.goToShoppingCart();
        Thread.sleep(2000); // Allow time for cart page load
        Assert.assertTrue(cartPage.macbookProductInCart.isDisplayed(), "Product not found in cart!");    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}