package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSauceDemo {
	
	public static WebDriver driver;
	
	//@Test
	public void testSauceDemo() {		
		driver = launch("chrome");
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		boolean actual = driver.getCurrentUrl().contains("/inventory.html");
		Assert.assertTrue(actual);
	}
	
	public static void main(String[] args) {
		driver = launch("firefox");
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
	
	public static WebDriver launch(String browserName) {
		WebDriver driver;
		switch (browserName.toUpperCase()) {
		case "CHROME":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;	
		case "EDGE":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		default:
			driver = null;
			break;
		}
		return driver;
	}

}