package week2.day2;

import org.openqa.selenium.WebDriver;

public interface IBrowserFactory {
	
	public WebDriver launch(String browserName);

}
