package Utilities;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentReports;

	public class TestListener extends BaseTest implements ITestListener {

	    @Override
	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.log(Status.PASS, "Test Passed: " + result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.log(Status.FAIL, "Test Failed: " + result.getMethod().getMethodName());
	        test.log(Status.FAIL, result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.log(Status.SKIP, "Test Skipped: " + result.getMethod().getMethodName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();  // Very important for writing the report
	    }
	}


