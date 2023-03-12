package week1.day2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	@DataProvider(name = "testdata")
	public Object[][] getData() {
		
		return new Object[][] {
			{"username1", "password1"},
			{"username2", "password2"},
			{"username3", "password3"},
			{"username4", "password4"},
			{"username5", "password5"},
		};
		
	}
	
	@Test(dataProvider = "testdata")
	public void test(String userName, String pwd) {
		System.out.println(userName+" - "+pwd);
	}

}