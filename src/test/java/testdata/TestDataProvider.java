package testdata;

import org.testng.annotations.DataProvider;

import base.BaseHooks;
import utils.ExcelUtility;

public class TestDataProvider extends BaseHooks {
	
	@DataProvider
	public Object[][] getData(){
		System.out.println(fileName);
		return null;
		
	}

}
