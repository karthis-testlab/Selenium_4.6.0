package com.demo.shadow.dom.sukgu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class SalesforceShadom {

	public static void main(String[] args) {		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String originalWindow = driver.getWindowHandle();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf@1234");
		driver.findElement(By.id("Login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='tileTitle']/h2/span[text()='Mobile Publisher']/following::span[text()='Learn More']")));
		driver.findElement(By.xpath("//div[@class='tileTitle']/h2/span[text()='Mobile Publisher']/following::span[text()='Learn More']")).click();
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    for (String windowHandle : driver.getWindowHandles()) {
	        if(!originalWindow.contentEquals(windowHandle)) {
	            driver.switchTo().window(windowHandle);
	            break;
	        }
	    }
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Confirm']")));
	    driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	    wait.until(ExpectedConditions.titleIs("Create and Publish Custom-Branded Mobile Apps - Salesforce.com"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
	    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	    
	    Shadow shadowDom = new Shadow(driver);
	    shadowDom.findElementByXPath("//span[text()='Learning']").click();
	    WebElement learning = shadowDom.findElementByXPath("//span[text()='Learning on Trailhead'");
	    WebElement certification = shadowDom.findElementByXPath("//a[text()='Salesforce Certification']");
	    Actions actions = new Actions(driver);
	    actions.moveToElement(learning).moveToElement(certification).click().perform();
	}

}