package objectRepositoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.ConfigReader;;

public class testConfig {

	ConfigReader config;
	
	@BeforeTest
	public void setUp() {
		
		config = new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		
	}
	
	@Test
	public void config() throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(config.getApplicationURL());
		
		System.out.println("The page tile is " + driver.getTitle());
		
		driver.quit();
		
	}
	
}
