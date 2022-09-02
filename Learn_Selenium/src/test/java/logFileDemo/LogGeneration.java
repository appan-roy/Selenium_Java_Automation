package logFileDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogGeneration {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("LogGeneration");
		
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		logger.info("Launched Chrome Browser");
		
		driver.manage().window().maximize();
		
		logger.info("Maximized Chrome Browser");
 
		driver.get("file:///E:/Softwares/My%20PC%20Apps/Selenium/Alert%20Popup.html");
		
		logger.info("The url opened");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		logger.info("The button is clicked");
		
		Alert alt = driver.switchTo().alert();
		
		logger.info("Control goes to the alert popup");
		
		alt.accept();
		
		logger.info("The positive response has been triggered");

	}

}
