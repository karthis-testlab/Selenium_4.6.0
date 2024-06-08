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
	
	@Given("User wants to select a car type {string} from taxi.com app")
	public void user_wants_to_select_a_car_type_from_taxi_com_app(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("User selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("User pays {int} rupees")
	public void user_pays_rupees(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}