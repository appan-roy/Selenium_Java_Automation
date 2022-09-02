package elementsHandlingDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
		 
		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	 
			driver.get("http://learn-automation.com");
		  
			Thread.sleep(5000);
		 
			// This  will scroll page 400 pixel vertically down
			((JavascriptExecutor)driver).executeScript("scroll(0,400)");
			
		 }
		 
		}

