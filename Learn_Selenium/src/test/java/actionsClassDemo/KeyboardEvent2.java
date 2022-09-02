package actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("http://the-internet.herokuapp.com/key_presses?");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ESCAPE).perform();
		
		String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(result.contains("ESCAPE")) {
			
			System.out.println("Test passed");
			
		}
		
		else {
			
			System.out.println("Test failed");
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
