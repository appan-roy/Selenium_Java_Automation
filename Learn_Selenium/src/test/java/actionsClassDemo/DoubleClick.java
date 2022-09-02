package actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
