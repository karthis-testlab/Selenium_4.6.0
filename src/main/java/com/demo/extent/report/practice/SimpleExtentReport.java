package com.demo.extent.report.practice;

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
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/SimpleReport.html");
		extent.attachReporter(spark);

		// Format One
		extent.createTest("Pass Test Case").pass("Test Cases Passed!!!");
		extent.createTest("Fail Test Case").fail("Test Cases Failed!!!", MediaEntityBuilder.createScreenCaptureFromPath("../images/screenshot1.png").build());

		// Format Two
		ExtentTest test = extent.createTest("TC001");
		test.pass("Test Cases Passed!!!");
		test.fail("Test Cases Failed!!!");

		// Format Three
		ExtentTest suite = extent.createTest("Suite Name");
		// Test Case 1
		ExtentTest test1 = suite.createNode("Test Case 1");
		test1.log(Status.PASS, "Test Case Passed!!!");
		test1.log(Status.FAIL, "Test Case FAILED!!!", MediaEntityBuilder.createScreenCaptureFromPath("../images/screenshot1.png").build());
		// Test Case 2
		ExtentTest test2 = suite.createNode("Test Case 2");
		test2.log(Status.PASS, "Test Case Passed!!!");
		test2.log(Status.PASS, "Test Case Passed!!!");

		// Format Four
		ExtentTest suite1 = extent.createTest("Suite Name 1");
		// Test Case 1
		ExtentTest testFormat1 = suite1.createNode("Test Case 1");
		testFormat1.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed!!!", ExtentColor.GREEN));
		testFormat1.log(Status.FAIL, "Test Case FAILED!!!", MediaEntityBuilder.createScreenCaptureFromPath("../images/screenshot1.png").build());
		// Test Case 2
		ExtentTest testFormat2 = suite1.createNode("Test Case 2");
		testFormat2.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed!!!", ExtentColor.GREEN));
		testFormat2.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed!!!", ExtentColor.GREEN));

		extent.flush();
	}

}