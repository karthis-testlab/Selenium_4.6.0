package com.extent.report.demo.sel;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SimpleExtentReport {

	public static void main(String[] args) {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/ExtentBasicReport.html");
		extent.attachReporter(spark);
		extent.createTest("Pass Test Case").pass("Test case is passed!!!");
		extent.createTest("Fail Test Case").fail("Test case is failed!!!");
		extent.createTest("Info Test Case").info("Test case info!!!");
		extent.createTest("Warning Test Case").warning("Test case warning!!!");	
		
		ExtentTest suite = extent.createTest("Basic Test Suite");
		ExtentTest test = suite.createNode("Test Case 1");
		test.log(Status.PASS, "Test case is passed!!!");
		test.log(Status.FAIL, "Test case is failed!!!");
		
		ExtentTest test2 = suite.createNode("Test Case 2");
		test2.log(Status.PASS, "Test case is passed!!!");
		test2.log(Status.PASS, "Test case is passed!!!");
		
		ExtentTest test3 = suite.createNode("Test Case 3");
		test3.log(Status.PASS, MarkupHelper.createLabel("Test case is passed!!!", ExtentColor.GREEN));
		test3.log(Status.FAIL, "Test case is failed!!!", MediaEntityBuilder.createScreenCaptureFromPath("../images/screenshot1.png").build());
		
		extent.flush();
	}

}