package week2.day1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUser(String uName) {
		driver.findElement(By.id("user-name")).sendKeys(uName);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(By.id("login-button")).click();
	}

}
