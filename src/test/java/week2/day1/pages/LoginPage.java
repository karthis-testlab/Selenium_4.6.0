package week2.day1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ReadProperty;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUser(String uName) {
		driver.findElement(By.id(ReadProperty.readObject("LoginPage", "username.textbox.id"))).sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id(ReadProperty.readObject("LoginPage", "password.testbox.id"))).sendKeys(pwd);
		return this;
	}
	
	public InventoryPage clickLogin() {
		driver.findElement(By.id(ReadProperty.readObject("LoginPage", "login.button.id"))).click();
		return new InventoryPage(driver);
	}

}
