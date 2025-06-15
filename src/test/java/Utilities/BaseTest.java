package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class BaseTest {

    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeSuite
    public void setupExtent() {
    	ExtentSparkReporter spark = new ExtentSparkReporter("extent-report.html");
    	extent = new ExtentReports();
    	extent.attachReporter(spark);
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
