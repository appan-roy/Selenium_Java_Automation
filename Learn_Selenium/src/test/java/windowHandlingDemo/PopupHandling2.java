package windowHandlingDemo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent window id is "+parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		
		driver.switchTo().window(tabs.get(2));
		
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		
		System.out.println("Parent window title is "+driver.getTitle());
		
	}

}
