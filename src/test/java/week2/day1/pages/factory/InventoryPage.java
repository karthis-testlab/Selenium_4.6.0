package week2.day1.pages.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InventoryPage {
	
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void validateInventoryPageUrl() {
		boolean actual = driver.getCurrentUrl().contains("/inventory.html");
		Assert.assertTrue(actual);
	}

}
