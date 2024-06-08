package com.test.data.management;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderViaExcel {	
	
	@DataProvider(name = "GetTestData")
	public String[][] getExcelData() {
		return ExcelUtility.readExcelValue();
	}
	
	@Test(dataProvider = "GetTestData")
	public void testExcelData(String uName, String pwd) {
		System.out.println(uName + " - ");		
	}

}
