package com.demo.page.selenium.factory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {
	
	public ChromeDriver driver;
	public LoginPage loginPage;
	public LandingPage landingPage;
	
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		loginPage.enterUserName("");
		loginPage.enterPassword("");
		loginPage.clickOnLoginBtn();
	}
	
	@Test
	public void test1() {		
		landingPage = new LandingPage(driver);		
		landingPage.clickOnAppLauncher();
	}

}
