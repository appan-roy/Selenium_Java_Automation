package elementsHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import lib.HighlightElement;

public class HighlightElements {
	
		 
		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	 
			driver.get("https://www.facebook.com/");
			
			WebElement email = driver.findElement(By.id("email"));
			HighlightElement.highlight(driver, email);
			email.sendKeys("appan12345@gmail.com");
		  
			WebElement pwd = driver.findElement(By.id("pass"));
			HighlightElement.highlight(driver, pwd);
			pwd.sendKeys("123456");
			
			WebElement sub_btn = driver.findElement(By.xpath("//*[@type='submit']"));
			HighlightElement.highlight(driver, sub_btn);
			sub_btn.click();
			
		 }
		 
		}

