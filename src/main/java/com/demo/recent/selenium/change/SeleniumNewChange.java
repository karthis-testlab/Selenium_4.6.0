package com.demo.recent.selenium.change;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.demo.refactor.pages.LoginPage;


public class SeleniumNewChange {

	RemoteWebDriver driver;

	//@Test
	public void testChange() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	
	@Test
	public void testLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		new LoginPage(driver)
		.enterUserName("standard_user")
		.enterPassword("secret_sauce")
		.clickLoginBtn()
		.verifyCurrentUrl("/inventory.html");
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (!result.isSuccess()) {
			File src = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./images/screenshot1.png"));
		}
		driver.close();
	}

}