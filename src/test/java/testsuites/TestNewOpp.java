package testsuites;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import testdata.TestDataProvider;

public class TestNewOpp extends BaseHooks {
	
	@BeforeTest
	public void beforeTest() {
		fileName = "testFile";
	}
	
	@Test(dataProviderClass = TestDataProvider.class)
	public void test() {
		
	}

}
