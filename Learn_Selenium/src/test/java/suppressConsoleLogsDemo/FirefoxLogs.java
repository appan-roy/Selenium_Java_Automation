package suppressConsoleLogsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLogs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "./Firefoxlog.txt");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
		
	}

}
