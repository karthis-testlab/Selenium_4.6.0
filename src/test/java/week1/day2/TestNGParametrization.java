package week1.day2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametrization {
	
	@Test
	@Parameters({"username", "password"})
	public void test(String userName, String pwd) {
		
		System.out.println(userName+"-"+pwd);
		
		
	}

}