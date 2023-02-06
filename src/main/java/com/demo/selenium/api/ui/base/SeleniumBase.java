package com.demo.selenium.api.ui.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.demo.selenium.api.design.ISeleniumBase;

public class SeleniumBase implements ISeleniumBase {

	public RemoteWebDriver driver;

	public RemoteWebDriver launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new SafariDriver();
		}
		return driver;
	}

	public void goTo(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub

	}

	public void quitBrowser() {
		// TODO Auto-generated method stub

	}
	
	public WebElement getLocator(String domEle) {
		WebElement ele = null;
		String[] arr = domEle.split("=", 2);
		if (arr[0].equalsIgnoreCase("ID")) {
			ele = driver.findElement(By.id(arr[1]));
		} else if (arr[0].equalsIgnoreCase("NAME")) {
			ele = driver.findElement(By.name(arr[1]));
		}
		return ele;
	}

	public List<WebElement> getLocators(String domEle) {
		// TODO Auto-generated method stub
		return null;
	}

	public void type(WebElement locator) {
		// TODO Auto-generated method stub

	}

	public void click(WebElement locator) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(String title) {
		// TODO Auto-generated method stub

	}

	public void switchToFrame(int index) {
		// TODO Auto-generated method stub

	}

	public void switchToFrame(WebElement locator) {
		// TODO Auto-generated method stub

	}

	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub

	}

	public void defaultContent() {
		// TODO Auto-generated method stub

	}

	public boolean isTitleExpected(WebElement locator) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTextExpected(WebElement locator) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTextContains(WebElement locator) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isUrlExpected() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isUrlContains() {
		// TODO Auto-generated method stub
		return false;
	}

}