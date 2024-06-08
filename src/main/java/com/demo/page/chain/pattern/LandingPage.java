package com.demo.page.chain.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	private WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage clickOnAppLauncher() {
		driver.findElement(By.className("")).click();
		return this;
	}

}
