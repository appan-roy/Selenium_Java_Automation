package elementsHandlingDemo;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		List <WebElement> lists_of_links = driver.findElements(By.tagName("a"));
		
		System.out.println("The total no. of links on this page are: "+lists_of_links.size());
		
		for (WebElement webElement : lists_of_links) {
			System.out.println(webElement.getText());
		}
		
		List <WebElement> list_of_textbox = driver.findElements(By.xpath("//input[@type='text']"));
		
		System.out.println(list_of_textbox.size());
		
		List <WebElement> list_of_radio_btn = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println(list_of_radio_btn.size());
		
		List <WebElement> list_of_checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(list_of_checkbox.size());
		
		List <WebElement> list_of_dropdown = driver.findElements(By.tagName("Select"));
		
		System.out.println(list_of_dropdown.size());
		
		driver.quit();
		
	}

}
