package com.demo.data.provider.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@DataProvider(name = "GetData")
	public Object[][] getData() {
		return new Object[][] {
			{"Ram"},
			{"Sita"},
			{"John"}
		};
	}
	
	@Test(dataProvider = "GetData")
	public void testData(String name) {
		System.out.println("My Name is: "+name);
	}

}