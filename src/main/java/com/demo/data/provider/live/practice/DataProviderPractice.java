package com.demo.data.provider.live.practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderPractice {	
	
	@BeforeMethod
	@Parameters("City")
	public void beforeMethod(String cityName) {
		System.out.println(cityName);
	}
	
	@Test(dataProvider = "getData", dataProviderClass = TestDataGenerator.class)
	public void testData(String name, int rollId) {
		System.out.println("My name is: "+name+" , "+rollId);
	}

}