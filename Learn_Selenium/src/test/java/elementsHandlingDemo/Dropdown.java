package elementsHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
	@Test
	public void selectDD() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement select_day = driver.findElement(By.name("birthday_day"));
		
		Select day = new Select(select_day);
		
		WebElement select_month = driver.findElement(By.name("birthday_month"));
		
		Select month = new Select(select_month);
		
		WebElement select_year = driver.findElement(By.name("birthday_year"));
		
		Select year = new Select(select_year);
		
		day.selectByIndex(7);
		
		month.selectByValue("3");
		
		year.selectByVisibleText("1990");
		
	}
	
}
