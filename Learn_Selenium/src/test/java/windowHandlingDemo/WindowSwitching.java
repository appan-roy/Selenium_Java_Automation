package windowHandlingDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String parent_window = driver.getWindowHandle();
		
		System.out.println("Before switching title is "+driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='privacy-link']")).click();
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()){
			
			String child_window = i1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window)){
				
				driver.switchTo().window(child_window);
				
				Thread.sleep(3000);
				
				System.out.println("After swiching title is "+driver.getTitle());
				
				driver.close();
				
			}
			
		}
		
		driver.switchTo().window(parent_window);
		
		System.out.println("Again back to parent window. The parent window title is "+driver.getTitle());

	}

}
