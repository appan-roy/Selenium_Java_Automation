package elementsHandlingDemo;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	public static String driverPath = "E:\\\\Softwares\\\\My PC Apps\\\\Selenium\\\\Webdrivers\\\\chromedriver_win32\\";
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", driverPath+ "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		List<WebElement> flavour = driver.findElements(By.name("tool"));
		
		int length = flavour.size();
		
		System.out.println(length);
		
		Thread.sleep(7000);
		
		flavour.get(1).click();
		
		flavour.get(2).click();
		
		int i = 0;
		
		for(Iterator iterator = flavour.iterator(); iterator.hasNext();){
			
			WebElement webElement = (WebElement) iterator.next();
			
			System.out.println(flavour.get(i).getAttribute("value"));
			
			i++;
		}
	
	}

}
