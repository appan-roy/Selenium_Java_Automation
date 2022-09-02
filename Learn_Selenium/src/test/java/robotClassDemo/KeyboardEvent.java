package robotClassDemo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeyboardEvent {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("http://the-internet.herokuapp.com/key_presses?");
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ESCAPE);
		
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(result.contains("ESCAPE")) {
			
			System.out.println("Test passed");
			
		}
		
		else {
			
			System.out.println("Test failed");
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
