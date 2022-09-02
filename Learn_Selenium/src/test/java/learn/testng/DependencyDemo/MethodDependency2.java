package learn.testng.DependencyDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MethodDependency2 {

	WebDriver driver;
	
	@BeforeClass
	public void startBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Browser started");
		
	}
	
	@Test
	public void startApp(){
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String curr_url = driver.getCurrentUrl();
		
		Assert.assertTrue(curr_url.contains("wp-login"));
		
		System.out.println("Application loaded");
		
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp(){
		
		driver.findElement(By.id("user_login")).sendKeys("appan");
		
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		
		driver.findElement(By.id("wp-submit")).click();
		
		boolean status = driver.findElement(By.xpath("//*[@id='menu-dashboard']/a/div[3]")).isDisplayed();
		
		Assert.assertTrue(status);
		
		System.out.println("Login successful");
		
	}
	
	//THIS TEST SHOULD FAIL DUE TO ELEMENTNOTVISIBLEEXCEPTION AS LOGOUT LINK IS NOT VISIBLE. NEED TO IMPLEMENT MOUSE HOVER LOGIC HERE
	//HOWEVER, WE ARE TRYING TO SKIP THIS TEST BY FAILING loginApp() TEST CASE
	
	@Test(dependsOnMethods="loginApp")
	public void logoutApp(){
		
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.findElement(By.id("user_login")).isDisplayed());
		
		System.out.println("Logout successful");
		
	}
	
	@AfterClass
	public void closeBrowser(){
		
		driver.quit();
		
		System.out.println("Browser closed");
		
	}

}
