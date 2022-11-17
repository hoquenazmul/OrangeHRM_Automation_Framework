package com.stepdefs;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	@Given("go to the home page")
	public void go_to_the_home_page() {
		
	}

	@When("input the username")
	public void input_the_username() {
		
	}

	@When("input the password")
	public void input_the_password() {
		
	}

	@When("click on login button")
	public void click_on_login_button() {
		
	}

	@Then("validate the dashboard page")
	public void validate_the_dashboard_page() {
		
	}

	@When("input the username and password")
	public void input_the_username_and_password(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
	}

	@When("input the username test1")
	public void input_the_username_test1() {
		
	}

	@When("input the password test123")
	public void input_the_password_test123() {
		
	}

	@When("input the username test2")
	public void input_the_username_test2() {
		
	}

	@When("input the password test456")
	public void input_the_password_test456() {
		
	}

	@When("input the username test3")
	public void input_the_username_test3() {
		
	}

	@When("input the password test789")
	public void input_the_password_test789() {
		
	}
}
