package actionsClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		
		WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		
		act.dragAndDrop(src, dest).perform();

	}

}
