package webTableHandlingDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_DynamicApproach {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//*[@id=\"departureCalendar\"]")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='calDate']"));
		
		int total_days = dates.size();
		
		for(int i = 0; i < total_days; i++){
			
			String date = dates.get(i).getText();
			
			if(date.equals("28")){
				
				dates.get(i).click();
				
				break;
				
			}
				
		}
		
	}

}
