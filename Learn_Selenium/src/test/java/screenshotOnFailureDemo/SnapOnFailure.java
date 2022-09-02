package screenshotOnFailureDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import lib.Utility;

public class SnapOnFailure {

	WebDriver driver;
	
	@Test
	public void wordpressLogin(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		// Failing deliberately the password field //
		
		driver.findElement(By.id("txtPassword1")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus()){
			
			Utility.captureScreenshot(driver, result.getName());
			
		}
		
		driver.quit();
		
	}
	
}
