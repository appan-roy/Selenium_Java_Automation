package robotClassDemo;

import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MouseEvent {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("http://the-internet.herokuapp.com/key_presses?");
		
		Robot robot = new Robot();
		
		robot.delay(2000);

		robot.mouseMove(198, 132);
		
		robot.delay(1000);

		driver.quit();

	}

}
