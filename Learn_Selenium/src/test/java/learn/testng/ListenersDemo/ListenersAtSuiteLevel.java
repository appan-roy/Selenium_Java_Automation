package learn.testng.ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersAtSuiteLevel {

	@Test
	public void googleTitle(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	
	@Test
	public void test(){
		
		Assert.assertTrue(false);
		
		System.out.println("The test case passed");
		
	}
	
}
