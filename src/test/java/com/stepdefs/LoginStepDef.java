package com.stepdefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.basepage.BasePage;
import com.pagefactory.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BasePage {
	LoginPage pf;
	
	@Given("go to the home page")
	public void go_to_the_home_page() {
		init();
		pf = PageFactory.initElements(driver, LoginPage.class);
	}

	@When("input the username")
	public void input_the_username() {
		pf.getUsername().sendKeys(props.getProperty("username"));
	}

	@When("input the password")
	public void input_the_password() {
		pf.getPassword().sendKeys(props.getProperty("password"));
	}

	@When("click on login button")
	public void click_on_login_button() {
		pf.getLoginBtn().click();
	}

	@Then("validate the dashboard page")
	public void validate_the_dashboard_page() {
		Assert.assertEquals(pf.getDashboardTxt().getText(), "Dashboard");
		log.info("***** Login Successful *****");
	}
	
	@Then("check invalid credentials")
	public void check_invalid_credentials() {
		Assert.assertEquals(pf.getErrorMsg().getText(), "Invalid credentials");
		log.info("***** Login not Successful *****");
	}

	@When("input the username and password")
	public void input_the_username_and_password(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		
		pf.getUsername().sendKeys(data.get(0).get("username"));
		pf.getPassword().sendKeys(data.get(0).get("password"));
	}

	@When("input the username test1")
	public void input_the_username_test1() {
		pf.getUsername().sendKeys("test1");
	}

	@When("input the password test123")
	public void input_the_password_test123() {
		pf.getPassword().sendKeys("test123");
	}

	@When("input the username test2")
	public void input_the_username_test2() {
		pf.getUsername().sendKeys("test2");
	}

	@When("input the password test456")
	public void input_the_password_test456() {
		pf.getPassword().sendKeys("test456");
	}

	@When("input the username test3")
	public void input_the_username_test3() {
		pf.getUsername().sendKeys("test3");
	}

	@When("input the password test789")
	public void input_the_password_test789() {
		pf.getPassword().sendKeys("test789");
	}
}
