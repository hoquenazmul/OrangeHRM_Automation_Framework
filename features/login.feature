#Author: Nazmul Hoque

@smoke
@core_regression
Feature: OrangeHRM Login Feature

	Background:
		Given go to the login page
		Then validate the dashboard page

  @smoke
  @core_regression
  @OrangeHRM_44001
  Scenario: User should able to login with valid username and password
    When input the username
    And input the password
    And click on login button

  @smoke
  @core_regression
  @OrangeHRM_44002
  Scenario Outline: User should not be able to login with invalid username and password
    When input the <username>
    And input the <password>
    And click on login button

    Examples: 
      | username  | password |
      | test1     | test123  |
      | test2     | test456  |
      | test3     | test789  |
