package windowHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

// This coding is done with Selenium 4 //

public class MultipleTabHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("The parent window ID is " + parent);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
		
		String child = driver.getWindowHandle();
		
		System.out.println("The child window ID is " + child);
		
		newTab.get("https://www.google.com/");
		
		newTab.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		newTab.close();
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();

	}

}
