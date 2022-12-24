package com.demo.data.provider.live.practice;

import org.testng.annotations.DataProvider;

public class TestDataGenerator {
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{"Asma", 2},
			{"Javeed", 1},
			{"Jayaprakash", 3},
			{"Kalpana", 4}
		};
	}

}