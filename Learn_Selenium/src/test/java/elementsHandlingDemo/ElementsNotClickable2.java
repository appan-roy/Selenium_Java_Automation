package elementsHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsNotClickable2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		// Making browser in fullscreen mode to avoid element overlapping which causes Element Not clickable At Point Exception
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();

	}

}
