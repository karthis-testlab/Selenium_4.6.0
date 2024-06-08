package week1.day2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ChromeBrowser {
	
	ChromeDriver driver;

	@Test
	public void testChromeBrowser() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/karthistestlab/Downloads/radiobutton.html");
		driver.findElements(By.xpath("//input[@id='buttons']"));
		//AssertJUnit.assertTrue(false);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {

		if (!result.isSuccess()) {
			File srcFile = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("./images/failed.png"));
		}

	}

}