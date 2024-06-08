package com.test.data.management;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingTestDataInParameter {
	
	
	@BeforeMethod
	@Parameters({"url"}) 
	public void beforeMethod(String url) {
		System.out.println(url);
	}
	
	@Test
	@Parameters({"username", "password"})
	public void testTestDataParameter(String uName, String pwd) {
		System.out.println(uName);
		System.out.println(pwd);
	}

}
