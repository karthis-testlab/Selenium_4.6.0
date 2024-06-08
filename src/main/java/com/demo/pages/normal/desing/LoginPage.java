package com.demo.pages.normal.desing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String userName) {
		driver.findElement(By.id("")).sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.id("")).sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(By.id("")).click();
	}

}