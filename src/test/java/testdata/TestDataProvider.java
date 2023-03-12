package testdata;

import org.testng.annotations.DataProvider;

import utils.ExcelUtility;

public class TestDataProvider {
	
	@DataProvider
	public Object[][] getData(){
		return ExcelUtility.getExcelData("");
		
	}

}
