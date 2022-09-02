package windowHandlingDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent window id is "+parent);
		
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		int count = allWindows.size();
		
		System.out.println("There are total " +count+ " windows");
		
		for(String child:allWindows){
			
			if(!parent.equalsIgnoreCase(child)){
				
				driver.switchTo().window(child);
				
				WebElement srchbox = driver.findElement(By.name("q"));
				
				srchbox.sendKeys("Selenium");
				
				srchbox.sendKeys(Keys.ENTER);
				
				Thread.sleep(3000);
				
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parent);
		
		System.out.println("Parent window title is "+driver.getTitle());
		

	}

}
