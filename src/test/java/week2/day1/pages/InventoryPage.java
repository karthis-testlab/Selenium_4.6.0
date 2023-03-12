package week2.day1.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InventoryPage {
	
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateInventoryPageUrl() {
		boolean actual = driver.getCurrentUrl().contains("/inventory.html");
		Assert.assertTrue(actual);
	}
	

}
