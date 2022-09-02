package windowHandlingDemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent window id is "+parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		int count = allWindows.size();
		
		System.out.println("There are total " +count+ " windows");
		
		for(String child:allWindows){
			
			if(!parent.equalsIgnoreCase(child)){
				
				driver.switchTo().window(child);
				
				System.out.println("The child window title is "+driver.getTitle());
				
				Thread.sleep(3000);
				
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parent);
		
		System.out.println("Parent window title is "+driver.getTitle());
		
	}

}
