package com.demo.testng.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	private int count = 0;
	private int maxCount = 10;

	public boolean retry(ITestResult result) {
		while(count < maxCount) {
			count++;
			return true;
		}
		return false;
	}

}