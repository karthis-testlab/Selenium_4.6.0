package com.demo.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteLanuch {

	public static void main(String[] args) throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability("platformName", "Mac");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.119:4444"), chromeOptions);
		driver.get("https://www.saucedemo.com/");
	}

}