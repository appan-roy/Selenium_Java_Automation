package learn.cucumber.stepDefBackground;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemo {
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() {
	    System.out.println("User enters username and password");
	}

	@When("^Clicks on login$")
	public void clicks_on_login() {
		System.out.println("Clicks on login");
	}

	@Then("^User should be landed to home page$")
	public void user_should_be_landed_to_home_page() {
		System.out.println("User should be landed to home page");
	}

	@When("^User clicks on dashboard tab$")
	public void user_clicks_on_dashboard_tab() {
		System.out.println("User clicks on dashboard tab");
	}

	@Then("^Quick launch toolbar is displayed$")
	public void quick_launch_toolbar_is_displayed() {
		System.out.println("Quick launch toolbar is displayed");
	}

	@When("^User clicks on welcome link$")
	public void user_clicks_on_welcome_link() {
		System.out.println("User clicks on welcome link");
	}

	@Then("^Logout link is displayed$")
	public void logout_link_is_displayed() {
		System.out.println("Logout link is displayed");
	}
	
}
