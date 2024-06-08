package week1.day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LaunchBrowser {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// https://login.salesforce.com/
		// hari.radhakrishnan@qeagle.com
		// Leaf@123
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--disable-notifications"); ChromeDriver driver = new
		 * ChromeDriver(options); driver.manage().window().maximize();
		 * driver.get("https://login.salesforce.com/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); WebElement
		 * username = driver.findElement(By.id("username"));
		 * username.sendKeys("hari.radhakrishnan@qeagle.com");
		 * driver.findElement(RelativeLocator.with(By.id("username")).below(By.tagName(
		 * "input"))).sendKeys("hari.radhakrishnan@qeagle.com");
		 * driver.findElement(By.id("Login")).click();
		 */
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--remote-allow-origins=*");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setVersion("114.0");
		dc.setCapability(ChromeOptions.CAPABILITY, options);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);

		driver.get("https://www.google.com");
		Thread.sleep(15000);

		System.out.println("Page title is: " + driver.getTitle());

		String browserName = driver.getCapabilities().getBrowserName();
		System.out.println(browserName);

		String browserVersion = driver.getCapabilities().getBrowserVersion();
		System.out.println(browserVersion);

		Platform os = driver.getCapabilities().getPlatformName();
		System.out.println(os);
		
		driver.close();

	}

}
