package com.testng.retry.lisenter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCases {
	
	@Test
	public void test1() {
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(false, true);
	}

}