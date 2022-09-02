package learn.cucumber.stepDefHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemo {

	/*
	 * Hooks: The hooks @Before and @After runs only once for each scenarios. It runs at scenario level. The
	 * hooks with same annotations can be run with different orders. The priority level of hooks are as below-
	 * only order > tags with order > only tags
	 */
	
	// Priority 1 - only order
	@Before(order = 1)
	public void set_Up() {
		System.out.println("This is setup 1");
	}
	
	// Priority 3 - only tags
	@Before("@smoke")
	public void set_Up_2() {
		System.out.println("This is setup 2");
	}
	
	// Priority 2 - tags with order
	@Before(value = "@smoke", order = 3)
	public void set_Up_3() {
		System.out.println("This is setup 3");
	}
	
	@After(order = 1)
	public void tear_Down() {
		System.out.println("This is teardown 1");
	}
	
	@After("@smoke")
	public void tear_Down_2() {
		System.out.println("This is teardown 2");
	}
	
	@After(value = "@smoke", order = 3)
	public void tear_Down_3() {
		System.out.println("This is teardown 3");
	}
	
	@Given("^User opens application$")
	public void user_opens_application() {
	    System.out.println("User opens application");
	}

	@When("^User enter valid username and valid password$")
	public void user_enter_valid_username_and_valid_password() {
		System.out.println("User enters valid credentials");
	}

	@When("^Click on login button$")
	public void click_on_login_button() {
		System.out.println("Login button is clicked");
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() {
		System.out.println("Login is successful");
	}

	@When("^User click on logout button$")
	public void user_click_on_logout_button() {
		System.out.println("Logout button is clicked");
	}

	@Then("^Logout should be successful$")
	public void logout_should_be_successful() {
	    System.out.println("Logout is successful");
	}
	
}
