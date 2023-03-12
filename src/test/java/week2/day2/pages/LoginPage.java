package week2.day2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUser(String uName) {
		driver.findElement(By.id("user-name")).sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	public InventoryPage clickLogin() {
		driver.findElement(By.id("login-button")).click();
		return new InventoryPage(driver);
	}
	
	public void clickLoginBtn() {
		driver.findElement(By.id("login-button")).click();
	}
	
	public LoginPage clickLoginNeg() {
		driver.findElement(By.id("login-button")).click();
		return this;
	}
	
	public LoginPage verifyErrorMsg() {
		String text = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println(text);
		return this;
	}

}
