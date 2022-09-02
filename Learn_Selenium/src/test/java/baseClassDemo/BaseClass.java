package baseClassDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setupApplication(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		Reporter.log("========Broser Session Started=========", true);
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		Reporter.log("========Application Started=========", true);
		
	}
	
	@AfterMethod
	public void closeApplication(){
		
		driver.quit();
		
		Reporter.log("========Broser Session Ended=========", true);
		
	}
	
}
