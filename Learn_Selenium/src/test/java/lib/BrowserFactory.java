package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("internetexplorer")) {
			
			System.setProperty("webdriver.ie.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		return driver;
		
	}

}
