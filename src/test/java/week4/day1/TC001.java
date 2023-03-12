package week4.day1;

import org.testng.annotations.Test;

public class TC001 extends TestNGHooks {
	
	@Test
	public void test_TC001() {
		new LoginPage()
		.enterUser("standard_user")
		.enterPassword("secret_sauce")
		.clickLogin();
	}

}
