package crossBrowserDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyPageTitle {

	WebDriver driver;
	
	@Test
	@Parameters("browser")	// The parameter needs to be passed through the testng XML file //
	public void verifyTitle(String browserName){
		
		if(browserName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("IE")){
			
			System.setProperty("webdriver.ie.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
}
