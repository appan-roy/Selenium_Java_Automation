package jsExecutorDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("alert('Welcome to Selenium')");

	}

}
