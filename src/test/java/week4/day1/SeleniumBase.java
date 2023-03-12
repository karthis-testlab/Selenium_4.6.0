package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumBase implements ISeleniumBaseDesign {
	
	public static WebDriver driver;

	public WebDriver browser(String browserName) {
		BrowserType browsers = BrowserType.valueOf(browserName.toUpperCase());
		switch (browsers) {
		case CHROME:
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-notfications");
			chromeOptions.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			break;
		case FIREFOX:
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("--disable-notifications");
			driver = new FirefoxDriver(firefoxOptions);
			driver.manage().window().maximize();
			break;
		case EDGE:
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--disable-notifications");
			driver = new EdgeDriver(edgeOptions);
			driver.manage().window().maximize();
		default:
			driver = null;
			break;
		}
		return driver;
	}
	
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	public void quitBrowser() {
		// TODO Auto-generated method stub
		
	}
	
	public void open(String aut) {	
		try {
			driver.get(aut);
			System.out.println("Given "+aut+"in the launched browser");
		} catch (Exception e) {
			System.out.println("Unable to open given "+aut+" in the browser because of "+e.getMessage());
		}
	}

	//id=user-name -> [id, user-name]
	public WebElement getWebElement(String locator) {
	    WebElement element = null;
		String[] split = locator.split("=", 2);
		LocatorType locatorType = LocatorType.valueOf(split[0].toUpperCase());
		switch (locatorType) {
		case ID:
			element = driver.findElement(By.id(split[1]));
			break;
		case NAME:	
			element = driver.findElement(By.name(split[1]));
			break;
		case CLASSNAME:
			element = driver.findElement(By.className(split[1]));
			break;
		case LINKTEXT:
			element = driver.findElement(By.linkText(split[1]));
			break;
		case PARTCIALLINKTEXT:
			element = driver.findElement(By.partialLinkText(split[1]));
			break;
		case TAGNAME:
			element = driver.findElement(By.tagName(split[1]));
			break;
		case CSSSELECTOR:
			element = driver.findElement(By.cssSelector(split[1]));
			break;
		case XPATH:
			element = driver.findElement(By.xpath(split[1]));
		default:
			element = null;
			break;
		}
		return element;
	}

	public List<WebElement> getWebElements(String locator) {
		// TODO Auto-generated method stub
		return null;
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);		
	}

	public void click(WebElement ele) {	
		ele.click();
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectValueInDropdown(WebElement ele, String text) {
		// TODO Auto-generated method stub
		
	}

	public void moveToParticularElement(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public byte[] takeSnap() {
		// TODO Auto-generated method stub
		return null;
	}	

}