Feature: Test OrangeHRM Login Scenario

	@smoke
  Scenario: Test login with valid credential
    Given Open chrome and start application
    When I enter valid "Admin" and valid "admin123"
    Then user should be able to login successfully
    Then the application should be closed
    