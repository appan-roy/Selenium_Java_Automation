package synchronizationDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/");
		
		driver.manage().window().maximize();
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			wait.until(ExpectedConditions.titleContains("Selenium Automation Practice Form"));
			
		} catch (TimeoutException e) {
			
			System.out.println("Are you sure the element is present?");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		finally {
			
			System.out.println("The title of the page is " +driver.getTitle());
			
		}
		
	}

}
