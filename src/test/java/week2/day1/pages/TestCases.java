package week2.day1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {
	
	@Test
	public void test_login_page() {
		WebDriver driver = new ChromeDriver();
//		LoginPage login = new LoginPage(driver);
//		InventoryPage inventory = new InventoryPage(driver);
//		login.enterUser("user");
//		login.enterPassword("user");
//		login.clickLogin();
//		inventory.validateInventoryPageUrl();
		new LoginPage(driver)
		.enterUser("user")
		.enterPassword("pass")
		.clickLogin()		
		.validateInventoryPageUrl();
		
	}

}