package week2.day1;

import org.testng.annotations.Test;

import week2.day1.pages.factory.InventoryPage;
import week2.day1.pages.factory.LoginPage;


public class TestDemoSauce extends TestNGHooks{
	
	@Test
	public void testcase1() {		
		
		LoginPage login = new LoginPage(driver);
		InventoryPage inventory = new InventoryPage(driver);
		login.enterUser("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
		inventory.validateInventoryPageUrl();
	
	}

}