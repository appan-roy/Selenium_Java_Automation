package learn.cucumber.stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFeature {

	WebDriver driver;

	@Given("User opens the chrome browser")
	public void user_opens_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is opened");
	}

	@Then("User launches the application")
	public void user_launches_the_application() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("Application is launched");
	}

	@Then("User enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		System.out.println("User enters username and password");
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("User clicks on login button");
	}

	@Then("User should be login to the application successfully")
	public void user_should_be_login_to_the_application_successfully() {
		if (driver.findElements(By.xpath("//a/b[contains(text(),'Dashboard')]")).size() != 0)
			assertTrue(true);
		else
			assertTrue(false);
		System.out.println("Login is successful");
	}

	@Then("User closes the browser")
	public void user_closes_the_browser() {
		driver.quit();
		System.out.println("User closes the browser");
	}
	
	@Then("User enters the credentials")
	public void user_enters_credential_to_login(DataTable userDetails) {

		List<List<String>> cred = userDetails.cells();

		int rows = cred.size();
		int columns = cred.get(0).size();

		System.out.println("Total cred set : " + rows);
		System.out.println("Total cred attributes : " + columns);

		for (int i = 0; i < rows; i++) {

			WebElement uname = driver.findElement(By.id("txtUsername"));
			WebElement pwd = driver.findElement(By.id("txtPassword"));
			
			uname.clear();
			uname.sendKeys(cred.get(i).get(0));
			
			pwd.clear();
			pwd.sendKeys(cred.get(i).get(1));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
