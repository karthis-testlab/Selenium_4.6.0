package com.demo.cucumber.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		         features = "@failedRetry.txt",
		         glue = "com.demo.step.definitions",
		         dryRun = false,
		         plugin = {
		        		 "pretty",
		        		 "rerun:failedRetry.txt"
		         },
		         monochrome = true
		        )
public class CucumberRetryTestRunner extends AbstractTestNGCucumberTests {	

}