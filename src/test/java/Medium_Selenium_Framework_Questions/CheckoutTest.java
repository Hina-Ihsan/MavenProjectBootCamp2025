package Medium_Selenium_Framework_Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import org.testng.Assert;

import java.time.Duration;

public class CheckoutTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo");
        driver.findElement(By.linkText("MacBook")).click();
    }

    @Test
    public void verifyProductInCheckoutPage() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        System.out.println("Clicking Add to Cart...");
        checkoutPage.addProductToCart();

        // Wait for success alert or cart link to be available
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));

        System.out.println("Navigating to checkout...");
        checkoutPage.goToCheckout();

        System.out.println("Verifying product is in checkout...");
        Assert.assertTrue(checkoutPage.macbookProductInCheckout.isDisplayed(), "Product is not visible on checkout page!");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
