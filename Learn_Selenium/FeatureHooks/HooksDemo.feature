Feature: Test OrangeHRM Login Logout Scenario

  @smoke
  Scenario: Test login with valid credential
    Given User opens application
    When User enter valid username and valid password
    And Click on login button
    Then Login should be successful
  
  @sanity
  Scenario: Test logout
    When User click on logout button
    Then Logout should be successful
