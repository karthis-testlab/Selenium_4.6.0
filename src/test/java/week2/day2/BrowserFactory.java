package week2.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory implements IBrowserFactory {
	
	private WebDriver driver;

	@Override
	public WebDriver launch(String browserName) {
		switch (BrowserType.valueOf(browserName.toUpperCase())) {
		case CHROME:
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;	
		case EDGE:
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