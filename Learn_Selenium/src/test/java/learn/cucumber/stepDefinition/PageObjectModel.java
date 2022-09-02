package learn.cucumber.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import learn.cucumber.pages.LoginPage_POM;

public class PageObjectModel {

	WebDriver driver = null;
	
	LoginPage_POM login;
	
	@Given("^Open browser and launch application$")
	public void Open_chrome_and_start_application() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://example.testproject.io/web/");
		
	}

	@When("^The user enters valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String uid, String pwd) throws Throwable {
	    
		login = new LoginPage_POM(driver);
		
		login.enterUsername(uid);
		
		login.enterPassword(pwd);
			
	}

	@Then("^The user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	   
		login.clickLoginButton();
		
		login.checkLogoutButtonDisplayed();
		
	}
	
	@Then("^Close the application$")
	public void the_application_should_be_closed() throws Throwable {
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
}
