package com.demo.page.chain.pattern;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
	
	public ChromeDriver driver;	
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
	    new LoginPage(driver)
	    .enterUserName("")
	    .enterPassword("")
	    .clickOnLoginBtn();
	}
	
	@Test
	public void test1() {		
		new LandingPage(driver)
		.clickOnAppLauncher();
	}
	
	@Test
	public void test2() {
		new LoginPage(driver)
	    .enterUserName("")
	    .enterPassword("")
	    .clickOnLoginBtn()
	    .clickOnAppLauncher();
	}

}
