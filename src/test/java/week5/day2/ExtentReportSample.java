package week5.day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportSample {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		String dateTimeFormat = now.format(DateTimeFormatter.ofPattern("dMMYYYYHHmmssSSS"));
		
		ExtentReports extent = new ExtentReports();
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/index-"+dateTimeFormat+".html");
		
		extent.attachReporter(spark);
		
		ExtentTest testSuite = extent.createTest("Test Suite Name");
		
		ExtentTest testCase = testSuite.createNode("Test Case Name");
		
		testCase.pass("Test cases successfully!");	
		
		testCase.fail("Test Cases Failed!", MediaEntityBuilder.createScreenCaptureFromPath("../images/failed.png").build());
		
		testCase.warning("Warning Message!");
		
		testCase.info("Info Message");
		
		extent.flush();
		
		System.out.println("Report is successfullt generated in the ./reports/index-*.html location.");
	}

}
