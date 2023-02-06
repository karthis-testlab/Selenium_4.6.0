package com.demo.refactor.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class LoginPage {
	
	RemoteWebDriver driver;
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUserName(String uName) {		
		driver.findElement(By.id("user-name")).sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	public InventoryPage clickLoginBtn() {
		driver.findElement(By.id("login-button")).click();
		return new InventoryPage(driver);
	}
	
	public LoginPage clickLoginBtnWrongly() {
		driver.findElement(By.id("login-button")).click();
		return this;
	}
	
	public LoginPage validateInLineErrorMsg() {
		boolean isTrue = driver.findElement(By.xpath("//h3[@data-test='error']")).getText().equals("Epic sadface: Username is required");
		Assert.assertEquals(isTrue, true);
		return this;
	}

}