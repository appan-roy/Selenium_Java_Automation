package elementsHandlingDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XYCoordinates {

	static WebDriver driver;
	
	public static void main(String args[]) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/key_presses?");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("target"));

		Point location = element.getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		System.out.println("X coordinate : "+x);
		System.out.println("Y coordinate : "+y);
		
		driver.quit();
		
	}
	
}
