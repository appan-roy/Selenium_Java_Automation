package learn.cucumber.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenTesting {

	WebDriver driver = null;
	
	@Given("^Open chrome and launch application$")
	public void Open_chrome_and_start_application() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@When("^the user enters valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String uid, String pwd) throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		
		Thread.sleep(2000);
			
	}

	@Then("^the user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@Then("^close the application$")
	public void the_application_should_be_closed() {
	   
		driver.quit();
		
	}
	
}
