package com.demo.apache.poi.sel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtilityTest {
	
	@DataProvider
	public String[][] getData() {
		return ExcelUtility.readDataFromExcel();
	}
	
	@Test(dataProvider = "getData")
	public void testExcelUtility(String uName, String pwd) {
		System.out.println(uName+" | "+pwd);
	}

}