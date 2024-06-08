package com.demo.pages.normal.desing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	private WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAppLauncher() {
		driver.findElement(By.className("")).click();
	}

}
