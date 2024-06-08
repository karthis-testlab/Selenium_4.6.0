package com.demo.pages.normal.desing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
	
	public ChromeDriver driver;
	public LoginPage login; 
	public LandingPage landingPage;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
	    login = new LoginPage(driver);
		login.enterUserName("");
		login.enterPassword("");
		login.clickOnLoginBtn();
	}
	
	@Test
	public void test1() {		
		landingPage = new LandingPage(driver);		
		landingPage.clickOnAppLauncher();
	}

}
