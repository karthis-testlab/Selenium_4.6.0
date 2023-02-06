package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class InventoryPage {
	
	WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyCurrentUrl(String expected) {
		boolean isTrue = driver.getCurrentUrl().contains(expected);
		Assert.assertTrue(isTrue); 
	}	

}