package jsExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSType {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement email = driver.findElement(By.name("username"));
		
		jse.executeScript("arguments[0].value = 'dummy@gmail.com'", email);
		
		Thread.sleep(3000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='persistent']"));
		
		jse.executeScript("arguments[0].click()", checkbox);

	}

}
