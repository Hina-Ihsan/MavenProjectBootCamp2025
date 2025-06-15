package Medium_Selenium_Framework_Questions;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
public class CheckoutPage {
	    WebDriver driver;
	    public CheckoutPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    @FindBy(id = "button-cart")
	    WebElement addToCartButton;
	    @FindBy(linkText = "shopping cart")
	    WebElement shoppingCartLink;
	    @FindBy(linkText = "Checkout")
	    WebElement checkoutLink;
	    @FindBy(xpath = "//div[@id='content']//a[text()='MacBook']")
	    public WebElement macbookProductInCheckout;

	    public void addProductToCart() {
	        addToCartButton.click();
	    }

	    public void goToCheckout() {
	        shoppingCartLink.click();
	        checkoutLink.click();
	    }
	}

