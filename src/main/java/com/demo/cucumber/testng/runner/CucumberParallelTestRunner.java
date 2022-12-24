package com.demo.cucumber.testng.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		         features = "src/main/java/com/demo/features/LoginPage.feature",
		         glue = "com.demo.step.definitions",
		         dryRun = false,
		         monochrome = true
		        )
public class CucumberParallelTestRunner extends AbstractTestNGCucumberTests {	
	
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();		
	}

}