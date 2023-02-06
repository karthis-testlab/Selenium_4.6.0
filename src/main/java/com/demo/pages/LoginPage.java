package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id = "user-name")
	WebElement userNameTxt;
	
	@FindBy(id = "password")
	WebElement passwordTxt;
	
	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uName) {
		userNameTxt.sendKeys(uName);
	}
	
	public void enterPassword(String pwd) {
		passwordTxt.sendKeys(pwd);
	}
	
	public void clickOnTheLoginBtn() {
		loginBtn.click();
	}

}