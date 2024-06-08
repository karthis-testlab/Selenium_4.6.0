package com.test.data.management;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PassingTestDataInDataprovider {
	
	@DataProvider
	public Object[][] getTestData() {
		return new Object[][] {
			{"Ram", 123, true},
			{"King", 124, false}
		};
	}
	
	@Test(dataProvider = "getTestData")
	public void testDataprovider(String name, int rollNum, boolean isPass) {
		System.out.println(name + " - " + rollNum + " - " + isPass);
	}

}