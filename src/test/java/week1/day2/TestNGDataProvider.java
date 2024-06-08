package week1.day2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {	
	
	@Test(dataProvider = "testdata", dataProviderClass = DataProviderHandler.class)
	public void test(String userName, String pwd) {
		System.out.println(userName+" - "+pwd);
	}
	
	@Test(dataProvider = "getExcelData", dataProviderClass = DataProviderHandler.class)
	public void testExcelData(String userName, String pwd) {
		System.out.println(userName+" - "+pwd);
	}

}