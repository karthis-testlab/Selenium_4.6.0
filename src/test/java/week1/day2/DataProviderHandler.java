package week1.day2;

import org.testng.annotations.DataProvider;

public class DataProviderHandler {
	
	@DataProvider(name = "testdata")
	public Object[][] getData() {
		
		return new Object[][] {
			{"username1", "password1"},
			{"username2", "password2"},
			{"username3", "password3"},
			{"username4", "password4"},
		};
		
	}
	
	@DataProvider
	public String[][] getExcelData() {
		return ExcelHanlder.readValue("Login");	
	}

}