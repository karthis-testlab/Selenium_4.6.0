package week3.day1.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		          features = "src/test/java/week3/day1/features/LoginPage.feature",
		          glue = "week3.day1.step.definitions",
		          dryRun = false,
		          monochrome = true
		        )
public class CucumberTestNGRunner extends AbstractTestNGCucumberTests {

}