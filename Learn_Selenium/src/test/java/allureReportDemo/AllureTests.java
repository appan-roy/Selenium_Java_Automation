package allureReportDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


@Listeners({AllureListener.class})
public class AllureTests extends BaseClass{

	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		BaseClass bs = new BaseClass();
		driver = bs.initialize_driver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}
	
	@Test(priority = 1, description = "Verify login to application")
	@Description("Verify login to application")
	@Epic("Orange HRM")
	@Feature("Login to application")
	@Story("Story : User should be able to login to application")
	@Severity(SeverityLevel.CRITICAL)
	@Step("Verify login")
	public void loginToApplication() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}
	
	@Test(priority = 2, description = "Verify dashboard present")
	@Description("Verify dashboard present")
	@Epic("Orange HRM")
	@Feature("Presence of Dashboard")
	@Story("Story : Dashboard should be present")
	@Severity(SeverityLevel.MINOR)
	@Step("Verify dashboard")
	public void validateLogin() {
		
		boolean dashboardDisplayed = driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")).isDisplayed();
		
		Assert.assertEquals(dashboardDisplayed, true);
		
		if(dashboardDisplayed)
			System.out.println("Login successful");
		else
			System.out.println("Login failed");
		
	}
	
	@Test(priority = 3, description = "Verify logout from application")
	@Description("Verify logout from application")
	@Epic("Orange HRM")
	@Feature("Logout from Application")
	@Story("Story : User should be able to logout from application")
	@Severity(SeverityLevel.NORMAL)
	@Step("Verify logout")
	public void logoutFromApplication() {
		
		driver.findElement(By.id("welcome1")).click();	//deliberately failing for report [id = "welcome"]
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		
	}
	
	@Test(priority = 4, description = "Verify login button present")
	@Description("Verify login button present")
	@Epic("Orange HRM")
	@Feature("Presence of Login Button")
	@Story("Story : Login button should be present")
	@Severity(SeverityLevel.MINOR)
	@Step("Verify login button")
	public void validateLogout() {
		
		boolean loginBtnDisplayed = driver.findElement(By.id("btnLogin")).isDisplayed();
		
		Assert.assertEquals(loginBtnDisplayed, true);
		
		if(loginBtnDisplayed)
			System.out.println("Logout successful");
		else
			System.out.println("Logout failed");
		
	}
	
}
