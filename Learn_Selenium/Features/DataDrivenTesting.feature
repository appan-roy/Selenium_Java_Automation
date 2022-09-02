Feature: Test OrangeHRM Login Scenario using Data Driven Approach

	@sanity
  Scenario Outline: Test login with valid credential
    Given Open chrome and launch application
    When the user enters valid "<username>" and valid "<password>"
    Then the user should be able to login successfully
    Then close the application

    Examples: 
      | username | password  |
      | Admin    | admin12   |
      | Admin    | admin123  |
      | Admin    | admin1234 |
