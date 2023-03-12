package week3.day1.step.definitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void beforeEachScenario() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void afterEachScenario(Scenario scenario) throws IOException {
		
		if(scenario.isFailed()) {
			TakesScreenshot screenShot = (TakesScreenshot) driver;
			File srcImg = screenShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcImg, new File("./images/"+scenario.getId()+".png"));
		}
		
	}

}