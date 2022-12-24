package com.demo.data.provider.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice1 {
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{"EP1234", "Junior Software Automation Engineer", "King"},
			{"EP3217", "Senior Software Automation Engineer", "Alex"},
			{"EP4567", "Lead Software Automation Engineer", "Ram"}
		};
	}
	
	@Test(dataProvider = "getData")
	public void testData(String empId, String empRole, String empName) {
		System.out.println(empId+" , "+empRole+" , "+empName);
	}

}