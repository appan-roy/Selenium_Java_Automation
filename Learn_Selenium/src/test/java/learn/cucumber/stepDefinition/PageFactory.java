package learn.cucumber.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import learn.cucumber.pageFactory.HomePage_PF;
import learn.cucumber.pageFactory.LoginPage_PF;

public class PageFactory {

	WebDriver driver = null;
	
	LoginPage_PF login;
	
	HomePage_PF home;
	
	@Given("^Open browser and start application$")
	public void Open_chrome_and_start_application() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://example.testproject.io/web/");
		
	}

	@When("^User enters valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String uid, String pwd) throws Throwable {
	    
		login = new LoginPage_PF(driver);
		
		login.enterUsername(uid);
		
		login.enterPassword(pwd);
			
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		
		login.clickOnLoginBtn();
		
		Thread.sleep(2000);
		
		home = new HomePage_PF(driver);
		
		home.checkLogoutIsDisplayed();
		
	}
	
	@Then("^The application should be closed$")
	public void the_application_should_be_closed() {
	   
		driver.quit();
		
	}
	
}
