@Case_003
Feature: Login To Orange HRM

  Scenario: Login to Orange HRM
    Given User opens the chrome browser
    Then User launches the application
    Then User enters the credentials
      | Admin  | admin123 |
      | Admin1 | admin123 |
      | Admin2 | admin123 |
    And User closes the browser
