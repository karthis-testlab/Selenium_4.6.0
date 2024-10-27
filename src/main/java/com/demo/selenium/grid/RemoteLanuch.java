package com.demo.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteLanuch {

	public static void main(String[] args) throws MalformedURLException {
		EdgeOptions options = new EdgeOptions();
		options.setCapability("platformName", "Mac");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.119:4444"), options);
		driver.get("https://www.saucedemo.com/");
	}

}