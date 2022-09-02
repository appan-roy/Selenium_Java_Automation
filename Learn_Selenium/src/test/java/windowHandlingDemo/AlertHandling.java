package windowHandlingDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandling {
	
	@Test
	public void handlealert1() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("file:///E:/Softwares/My%20PC%20Apps/Selenium/Alert%20Popup.html");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
	
	}

	@Test
	public void handlealert2() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("file:///E:/Softwares/My%20PC%20Apps/Selenium/Alert%20Popup.html");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Thread.sleep(3000);
		
		String actual_msg = driver.switchTo().alert().getText();
		
		System.out.println("Actual alert message is "+actual_msg);
		
		driver.switchTo().alert().accept();
		
		String expected_msg = "You should press a button!";
		
		Assert.assertEquals(actual_msg, expected_msg);
	
	}
	
	@Test
	public void handlealert3() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("file:///E:/Softwares/My%20PC%20Apps/Selenium/Alert%20Popup.html");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Thread.sleep(3000);
		
		String actual_msg = driver.switchTo().alert().getText();
		
		System.out.println("Actual alert message is "+actual_msg);
		
		driver.switchTo().alert().dismiss();
		
		String expected_msg = "Press a button!";
		
		Assert.assertEquals(actual_msg, expected_msg);
	
	}
	
}
