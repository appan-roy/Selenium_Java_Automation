@Case_001
Feature: Login To Orange HRM

  Scenario: Login to Orange HRM
    Given User opens the chrome browser
    Then User launches the application
    Then User enters username and password
    And User clicks on login button
    Then User should be login to the application successfully
    And User closes the browser