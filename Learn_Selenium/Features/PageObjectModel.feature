# This tag overwrites all the below tags - @smoke, @sanity, @regression. Tags can be inherited from parent to child.
@tag
Feature: Test TestProject Login Scenario using Data Driven Approach and Page Object Model

	@sanity @regression
  Scenario Outline: Test login with valid credential
    Given Open browser and launch application
    When The user enters valid "<username>" and valid "<password>"
    Then The user should be able to login successfully
    Then Close the application

    Examples: 
      | username | password |
      | Steve    |    12345 |
      | Maria    |    12345 |
      | Elena    |    12345 |
