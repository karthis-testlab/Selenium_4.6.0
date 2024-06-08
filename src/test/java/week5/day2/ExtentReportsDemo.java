package week5.day2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo {

	public static void main(String[] args) {
		// Step 1: Create the object for the ExtentReports class
		ExtentReports extentReports = new ExtentReports();

		// Step 2: Create the object for the ExtentSparkReporter class and pass the
		// report file path
		ExtentSparkReporter spark = new ExtentSparkReporter("./report/result.html");
		spark.config().setTheme(Theme.DARK);

		// Step 3: We need to attach the ExtentSparkReporter object with the
		// ExtentReports object
		extentReports.attachReporter(spark);

		// Step 4: We need to create the test suite node
		ExtentTest testSuite = extentReports.createTest("Test Suite");

		// Step 5: We need to create the test case node
		ExtentTest testCase = testSuite.createNode("Test Case1");

		// Step 6: Log the each test step result
		testCase.log(Status.PASS, "Teststep one is pass");		
		
		//Step 7: Attached the screenshot in the spark html report 
		testCase.log(Status.FAIL, "Teststep two is failed", MediaEntityBuilder.createScreenCaptureFromPath("../report/images/failed.png").build());

		// Step 8: Call the flush method from the ExtentReports class to create report
		extentReports.flush();
	}

}