package utils;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageHandler {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Timeouts pageLoadTimeout = driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		String baseline = driver.getScreenshotAs(OutputType.BASE64);
		System.out.println(baseline);
		driver.close();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.saucedemo.com/");
		driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		String baseline1 = driver1.getScreenshotAs(OutputType.BASE64);
		System.out.println(baseline1);
		driver1.close();

	}

}
