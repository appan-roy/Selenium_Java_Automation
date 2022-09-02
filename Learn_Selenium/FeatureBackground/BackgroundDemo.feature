Feature: Test OrangeHRM Home Page Functionality

	# background is visible to all the stakeholders unlike hooks. It run before all the scenarios in a single 
	# feature file. Only common functionalities are kept in background section like login.
  Background: User is logged in to application
  	Given User is on login page
  	When User enters username and password
  	And Clicks on login
  	Then User should be landed to home page
  
  Scenario: Test presence of quick launch toolbar
    When User clicks on dashboard tab
    Then Quick launch toolbar is displayed

  Scenario: Test presence of logout link
    When User clicks on welcome link
    Then Logout link is displayed
