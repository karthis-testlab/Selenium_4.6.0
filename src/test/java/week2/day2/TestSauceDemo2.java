package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestSauceDemo2 {
	
	public static WebDriver driver;	
	
	public static void main(String[] args) {
		BrowserFactory browserFactory = new BrowserFactory();
		driver = browserFactory.launch("Chrome");
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		boolean actual = driver.getCurrentUrl().contains("/inventory.html");
		System.out.println(actual);
		driver.close();
		//Assert.assertTrue(actual);
	}	
	

}