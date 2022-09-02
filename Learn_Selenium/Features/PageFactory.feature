
Feature: Test TestProject Login Scenario using Data Driven Approach and Page Factory

	@regression
  Scenario Outline: Test login with valid credential
    Given Open browser and start application
    When User enters valid "<username>" and valid "<password>"
    Then User should be able to login successfully
    Then The application should be closed

    Examples: 
      | username | password |
      | Steve    |    12345 |
      | Maria    |    12345 |
      | Elena    |    12345 |
