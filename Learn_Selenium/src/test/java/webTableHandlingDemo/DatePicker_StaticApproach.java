package webTableHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// This is a static approach. Usually, this approach is neither effective nor recommended //

public class DatePicker_StaticApproach {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//*[@id=\"departureCalendar\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='fare_20191028']")).click();
		
	}

}
