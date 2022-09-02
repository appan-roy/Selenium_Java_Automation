package elementsHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown2 {
	
	@Test
	public void selectDD() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement select_day = driver.findElement(By.name("birthday_day"));
		
		Select day = new Select(select_day);
		
		WebElement selected_day = day.getFirstSelectedOption();
		
		System.out.println("Before selection selected day is " + selected_day.getText());
		
		WebElement select_month = driver.findElement(By.name("birthday_month"));
		
		Select month = new Select(select_month);
		
		WebElement selected_month = month.getFirstSelectedOption();
		
		System.out.println("Before selection selected month is " + selected_month.getText());
		
		WebElement select_year = driver.findElement(By.name("birthday_year"));
		
		Select year = new Select(select_year);
		
		WebElement selected_year = year.getFirstSelectedOption();
		
		System.out.println("Before selection selected year is " + selected_year.getText());
		
		day.selectByIndex(7);
		
		month.selectByValue("3");
		
		year.selectByVisibleText("1990");
		
		WebElement selected_day1 = day.getFirstSelectedOption();
		
		System.out.println("After selection selected day is " + selected_day1.getText());
		
		WebElement selected_month1 = month.getFirstSelectedOption();
		
		System.out.println("After selection selected month is " + selected_month1.getText());
		
		WebElement selected_year1 = year.getFirstSelectedOption();
		
		System.out.println("After selection selected year is " + selected_year1.getText());
		
	}
	
}
