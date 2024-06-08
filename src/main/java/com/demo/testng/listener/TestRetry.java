package com.demo.testng.listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRetry {
	
	private int count = 0;
	public WebDriver driver;
	
	@Test(retryAnalyzer = Retry.class)
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		if(count < 5) {
			Assert.assertTrue(false);
			count++;
		} else {
			Assert.assertTrue(true);
		}
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if(!result.isSuccess()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("./images/"+result.getName()+".png"));
		}
	}

}