package com.demo.cucumber.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		         features = "src/main/java/com/demo/features/LoginPage.feature",
		         glue = "com.demo.step.definitions",
		         tags = "not @skip",
		         dryRun = false,
		         monochrome = true,
		         plugin = {
		        		 "rerun:failedRetry.txt"
		         }
		        )
public class CucumberTestNGRunner extends AbstractTestNGCucumberTests {	
	
	
	

}