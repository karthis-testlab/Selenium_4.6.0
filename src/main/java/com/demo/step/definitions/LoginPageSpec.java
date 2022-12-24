package com.demo.step.definitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.demo.refactor.pages.InventoryPage;
import com.demo.refactor.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSpec {
	
	public RemoteWebDriver driver;
	
	@After
	public void run_after_each_scenario(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			File src = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./images/"+scenario.getId()+".png"));
		}
	}

	@Given("Ram is the already registered user of the sauce demo site")
	public void ram_is_the_already_registered_user_of_the_sauce_demo_site() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("he login with his valid user credentials")
	public void he_login_with_his_valid_user_credentials() {
		new LoginPage(driver)
		.enterUserName("standard_user")
		.enterPassword("secret_sauce")
		.clickLoginBtn();
	}

	@Then("he should be able to login into system and redriect to the inventory page")
	public void he_should_be_able_to_login_into_system_and_redriect_to_the_inventory_page() {
		new InventoryPage(driver)
		.verifyCurrentUrl("/inventory.html1");
	}
	
	@When("he wrongly click the login button without user credentials")
	public void he_wrongly_click_the_login_button_without_user_credentials() {
		new LoginPage(driver)
		.clickLoginBtnWrongly();
	}
	
	@When("he should able to see line error message and should not redirect into inventory page")
	public void he_should_able_to_see_line_error_message_and_should_not_redirect_into_inventory_page() {
	    new LoginPage(driver)
	    .validateInLineErrorMsg();
	}

}