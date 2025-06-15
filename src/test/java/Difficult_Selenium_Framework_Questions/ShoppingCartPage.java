package Difficult_Selenium_Framework_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    WebDriver driver;
    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "button-cart")
    WebElement addToCartButton;
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;
    @FindBy(xpath = "//div[@id='content']//a[text()='MacBook']")
    public WebElement macbookProductInCart;
    public void addProductToCart() {
        addToCartButton.click();
    }
    public void goToShoppingCart() {
        shoppingCartLink.click();
    }
}