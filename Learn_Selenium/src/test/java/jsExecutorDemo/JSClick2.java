package jsExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSClick2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		driver.findElement(By.name("username")).sendKeys("dummy@gmail.com");
		
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='persistent']"));
		
		jse.executeScript("arguments[0].click()", checkbox);

	}

}
