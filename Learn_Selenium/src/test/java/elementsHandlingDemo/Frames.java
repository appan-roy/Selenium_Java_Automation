package elementsHandlingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("file:///E:/Softwares/My PC Apps/Selenium/myframes.html");
		
		Thread.sleep(5000);
		
		int total_frames = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("There are total " + total_frames + " frames");
		
		driver.switchTo().frame("music");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Bengali Music")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement my_frame = driver.findElement(By.xpath("//iframe[@title='selenium_news']"));
		
		driver.switchTo().frame(my_frame);
		
		driver.findElement(By.xpath("//a[@title='Selenium Projects']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("/html/body/a")).click();
		
	}

}
