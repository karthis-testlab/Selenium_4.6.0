package testng.lisenter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;

public class TestCases {
	
	WebDriver driver;
	
	@Test
	public void test1() {
		Assert.assertTrue(true);		
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);		
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(true);		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result, Method method) {
		if(!result.isSuccess()) {			
			System.out.println(method.getName()+ " - was failed");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(src, new File("./image/failed-scresshoot-"+method.getName()+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
