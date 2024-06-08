package week4.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGHooks extends SeleniumBase {
	
	@BeforeMethod
	public void beforeMethod() {
		browser("chrome");
		open("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws FileNotFoundException, IOException {
		if(!result.isSuccess()) {
			FileOutputStream fos = new FileOutputStream(new File("./images/"+result.getName()+".png"));
			fos.write(takeSnap());
		}
	}

}