package exceptionHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StaleElementException {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://freecrm.co.in/");
		
		WebElement LogIn = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]"));
		
		LogIn.click();
		
		driver.navigate().back();
		
		Thread.sleep(10000);
		
		try {
			
			LogIn.click();
			
		} catch (Exception e) {
			
			LogIn = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]"));
			LogIn.click();
			
		}
		
		driver.quit();
		
	}

}
