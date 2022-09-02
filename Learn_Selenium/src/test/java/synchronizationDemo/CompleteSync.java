package synchronizationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
import lib.Sync;;
 
public class CompleteSync{
 
	@Test
	public void checkBuses(){

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
 
		driver.get("https://www.redbus.in/");
 
		Sync.isElementPresnt(driver,".//*[@id='src']", 20).sendKeys("Bangalore");
 
		Sync.isElementPresnt(driver,".//*[@id='dest']", 20).sendKeys("Chennai");

	}

}
