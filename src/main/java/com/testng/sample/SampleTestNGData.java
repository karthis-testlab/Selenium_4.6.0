package com.testng.sample;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestNGData {
	
	
	@Test 
	public void testDataProviderIndices() {
		int arr[] = {17, 32}; 
		int[] new_array = Arrays.copyOfRange(arr, 1, 2); 
		for (int num : new_array) 
			System.out.print(num + " "); 
	}
	
	@DataProvider(indices = {1})
	public Object[][] data() {
		return new Object[][] {
			{"username1", "password1"},
			{"username2", "password2"}
		};
	}

}