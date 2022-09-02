package actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		act.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		act.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
