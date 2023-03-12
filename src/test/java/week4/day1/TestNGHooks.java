package week4.day1;

import org.testng.annotations.BeforeMethod;

public class TestNGHooks extends SeleniumBase {
	
	@BeforeMethod
	public void beforeMethod() {
		browser("chrome");
		open("https://www.saucedemo.com/");
	}

}