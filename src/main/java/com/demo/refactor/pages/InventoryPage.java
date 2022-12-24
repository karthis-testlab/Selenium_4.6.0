package com.demo.refactor.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class InventoryPage {
	
	RemoteWebDriver driver;
	
	public InventoryPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public InventoryPage verifyCurrentUrl(String expected) {
		boolean isTrue = driver.getCurrentUrl().contains(expected);
		Assert.assertTrue(isTrue);
		return this; 
	}	

}