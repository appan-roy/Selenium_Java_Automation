package elementsHandlingDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		List <WebElement> gender = driver.findElements(By.name("sex"));
		
		Boolean value = gender.get(0).isSelected();
		int flag = 0;
		
		if(value){
			System.out.println("You have chosen MALE!!");
			flag = 1;
		}
		
		value = gender.get(1).isSelected();
		if(value) {
			System.out.println("You have chosen FEMALE!!");
			flag = 1;
		}
		
		if(flag == 0){
			gender.get(0).click();
		}
		
		System.out.println("Test is completed");
		
	}

}
