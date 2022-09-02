package elementsHandlingDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyDropdownDescending {

	WebDriver driver;
	
	@BeforeTest
	public void startSession() {
		
		System.out.println("Test has been started");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}

	@Test
	public void test1() {

		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		Select tools = new Select(driver.findElement(By.id("tools")));
		
		List actualList = new ArrayList();
		
		List<WebElement> myTools = tools.getOptions();
		
		for(WebElement ele:myTools) {
			
			String data = ele.getText();
			
			actualList.add(data);

		}
		
		List temp = new ArrayList<>();
		
		temp.addAll(actualList);
		
		Collections.sort(temp, Collections.reverseOrder());
		
		Assert.assertTrue(actualList.equals(temp));
		
	}
	
	@Test
	public void test2() {
 
		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		Select tools = new Select(driver.findElement(By.id("tools1")));
		
		List actualList = new ArrayList();
		
		List<WebElement> myTools = tools.getOptions();
		
		for(WebElement ele:myTools) {
			
			String data = ele.getText();
			
			actualList.add(data);

		}
		
		List temp = new ArrayList<>();
		
		temp.addAll(actualList);
		
		Collections.sort(temp, Collections.reverseOrder());
		
		Assert.assertTrue(actualList.equals(temp));
		
	}
	
	@AfterTest
	public void endSession() {
		
		driver.quit();
		
		System.out.println("Test has been ended");
		
	}

}
