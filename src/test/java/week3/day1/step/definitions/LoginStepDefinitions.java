package week3.day1.step.definitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import week2.day2.pages.InventoryPage;
import week2.day2.pages.LoginPage;


public class LoginStepDefinitions {
	
	private static WebDriver driver = Hooks.driver;
	
	@Given("Ram is the already registered user of the sauce demo site")
	public void ram_is_the_already_registered_user_of_the_sauce_demo_site() {		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@When("he login with his valid user credentials")
	public void he_login_with_his_valid_user_credentials() {
	   new LoginPage(driver)
	   .enterUser("standard_user")
	   .enterPassword("secret_sauce")
	   .clickLogin();
	   
	}
	
	@Then("he should be able to login into system and redriect to the inventory page")
	public void he_should_be_able_to_login_into_system_and_redriect_to_the_inventory_page() {
	    new InventoryPage(driver)
	    .validateInventoryPageUrl();
	}

}