package week1.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LaunchBrowser {

	public static void main(String[] args) {
		//https://login.salesforce.com/
		//hari.radhakrishnan@qeagle.com
		//Leaf@123
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(RelativeLocator.with(By.id("username")).below(By.tagName("input"))).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("Login")).click();

	}

}
