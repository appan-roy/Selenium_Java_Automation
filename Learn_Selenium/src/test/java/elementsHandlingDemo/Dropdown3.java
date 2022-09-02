package elementsHandlingDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown3 {
	
	@Test
	public void selectDD() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement select_month = driver.findElement(By.name("birthday_month"));
		
		Select month = new Select(select_month);
		
		List<WebElement> month_list = month.getOptions();
		
		int total_month = month_list.size();
		
		Assert.assertEquals(total_month, 13);
		
		System.out.println("Total month is " + total_month);
		
		for(WebElement ele:month_list) {
			
			String month_name = ele.getText();
			
			System.out.println("Months are " + month_name);
			
		}
		
	}
	
}
