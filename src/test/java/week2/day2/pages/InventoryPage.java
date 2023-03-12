package week2.day2.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InventoryPage {
	
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public InventoryPage validateInventoryPageUrl() {
		boolean actual = driver.getCurrentUrl().contains("/inventory.html1");
		System.out.println(actual);
		Assert.assertTrue(actual);
		return this;
	}
	
	

}
