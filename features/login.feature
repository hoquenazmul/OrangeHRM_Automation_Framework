#Author: Nazmul Hoque

@smoke
@core_regression
Feature: OrangeHRM Login Feature

	Background:
		Given go to the home page

  @smoke
  @core_regression
  @OrangeHRM_44001
  Scenario: User should able to login with valid username and password
    When input the username
    And input the password
    And click on login button
		Then validate the dashboard page
    
    
  @smoke
  @core_regression
  @OrangeHRM_44002
  Scenario: User should not able to login with valid username and invalid password
    When input the username and password
    | username | password |
    | Admin    | test123  |
    | Admin    | hello123 |
    And click on login button
		Then check invalid credentials

  @smoke
  @core_regression
  @OrangeHRM_44003
  Scenario Outline: User should not be able to login with invalid username and password
    When input the username <username>
    And input the password <password>
    And click on login button
		Then check invalid credentials

    Examples: 
      | username  | password |
      | test1     | test123  |
      | test2     | test456  |
      | test3     | test789  |
