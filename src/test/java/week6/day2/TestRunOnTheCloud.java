package week6.day2;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRunOnTheCloud {
	
	public RemoteWebDriver driver = null;
	public String sauceLabUrl = "<sauce-lab-url>";

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
		Date date = new Date();
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<String, Object>();
		sauceOptions.put("build", "selenium-build-0NR6D");
		sauceOptions.put("name", "test_saucelab" + formatter.format(date));
		browserOptions.setCapability("sauce:options", sauceOptions);
		URL url = new URL(sauceLabUrl);
		driver = new RemoteWebDriver(url, browserOptions);		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input#login-button")).click();
	}

	@Test
	public void test_saucelab() {
		boolean checkPoint1 = driver.getCurrentUrl().contains("/inventory.html");
		Assert.assertTrue(checkPoint1);
		String itemName = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[last()]")).getText();
		String itemPrice = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[last()]")).getText();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[last()]")).click();
		driver.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.cssSelector("a.shopping_cart_link")));
		driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
		boolean checkPoint2 = driver.findElement(By.cssSelector("div.inventory_item_name")).getText().equals(itemName);
		Assert.assertTrue(checkPoint2);
		boolean checkPoint3 = driver.findElement(By.cssSelector("div.inventory_item_price")).getText()
				.equals(itemPrice);
		Assert.assertTrue(checkPoint3);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}