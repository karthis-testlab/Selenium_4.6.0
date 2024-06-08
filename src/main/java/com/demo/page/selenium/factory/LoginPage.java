package com.demo.page.selenium.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {	
	
	@FindBy(id = "")
	WebElement eleUsername;
	
	@FindBy(id = "")
	WebElement elePassword;
	
	@FindBy(id = "")
	WebElement eleLogin;
	
	public LoginPage(WebDriver driver) {		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		eleUsername.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		elePassword.sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		eleLogin.click();
	}

}