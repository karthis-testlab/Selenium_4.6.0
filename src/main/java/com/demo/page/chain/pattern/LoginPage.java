package com.demo.page.chain.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUserName(String userName) {
		driver.findElement(By.id("")).sendKeys(userName);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("")).sendKeys(password);
		return this;
	}
	
	public LandingPage clickOnLoginBtn() {
		driver.findElement(By.id("")).click();
		return new LandingPage(driver);
	}

}