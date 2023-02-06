package com.demo.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage loginPage = new LoginPage(driver);
		InventoryPage invetoryPage = new InventoryPage(driver);
		loginPage.enterUserName("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickOnTheLoginBtn();
		invetoryPage.verifyCurrentUrl("/inventory.html");
	}

}
