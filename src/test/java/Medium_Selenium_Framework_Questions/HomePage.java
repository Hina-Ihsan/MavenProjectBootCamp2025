package Medium_Selenium_Framework_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//div[@id='logo']/a/img")
    WebElement logo;

    @FindBy(name = "search")
    WebElement searchBox;

    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsLink;

    @FindBy(linkText = "Show All Laptops & Notebooks")
    WebElement showAllLaptopsLink;

    public boolean isLogoDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(logo));
        return logo.isDisplayed();
    }

    public boolean isSearchBoxDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        return searchBox.isDisplayed();
    }

    public void clickLaptopsLink() {
        Actions actions = new Actions(driver);
        actions.moveToElement(laptopsLink).perform();
        wait.until(ExpectedConditions.visibilityOf(showAllLaptopsLink));
        showAllLaptopsLink.click();
    }
}
