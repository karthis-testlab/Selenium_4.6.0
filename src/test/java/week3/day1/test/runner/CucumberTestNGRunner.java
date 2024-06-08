package week3.day1.test.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		          features = "src/test/java/week3/day1/features/LoginPage.feature",
		          glue = "week3.day1.step.definitions",
		          dryRun = true,
		          monochrome = true,
		          plugin = {"pretty"},
		          tags = "@smoke and @regression"
		        )
public class CucumberTestNGRunner extends AbstractTestNGCucumberTests {

}