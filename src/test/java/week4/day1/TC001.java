package week4.day1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.testng.annotations.Test;

public class TC001 extends TestNGHooks {
	
	@Test
	public void test_TC001() throws IOException {
		new LoginPage()
		.enterUser("standard_user")
		.enterPassword("secret_sauce")
		.clickLogin();
		
		
	}

}
