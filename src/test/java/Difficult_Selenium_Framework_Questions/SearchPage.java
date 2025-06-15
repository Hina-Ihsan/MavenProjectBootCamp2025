package Difficult_Selenium_Framework_Questions;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
		public class SearchPage {

	    WebDriver driver;
	    public SearchPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    @FindBy(name = "search")
	    WebElement searchBox;

	    @FindBy(css = "button.btn.btn-default.btn-lg")
	    WebElement searchButton;

	    @FindBy(linkText = "MacBook")
	    public WebElement macbookLink;

	    public void searchForProduct(String productName) {
	        searchBox.sendKeys(productName);
	        searchButton.click();
	    }
	    public void clickOnProduct() {
	        macbookLink.click();
	    }
	}


