package learn.testng.AssertionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPageTitle {

	@Test
	public void test1(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		
		String expected_pagetitle = "Free Selenium ";
		
		String actual_pagetitle = driver.getTitle();
		
		Assert.assertEquals(actual_pagetitle, expected_pagetitle, "Title is not matching, test case failed !!");
		
		System.out.println("Title matched, test case passed !!");
	
	}
	
	@Test
	public void test2(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		
		String expected_pagetitle = "Free Selenium Tutorials";
		
		String actual_pagetitle = driver.getTitle();
		
		Assert.assertEquals(actual_pagetitle, expected_pagetitle, "Title is not matching, test case failed !!");
		
		System.out.println("Title matched, test case passed !!");
	
	}
	
	@Test
	public void test3(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		
		String actual_pagetitle = driver.getTitle();
		
		Assert.assertTrue(actual_pagetitle.contains("Selenium"));
		
		System.out.println("Test completed, test case passed !!");
	
	}
	
}
