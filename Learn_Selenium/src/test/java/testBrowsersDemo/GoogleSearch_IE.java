package testBrowsersDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleSearch_IE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement srchbox = driver.findElement(By.name("q"));
		
		srchbox.sendKeys("Selenium");
		
		WebElement srchbtn = driver.findElement(By.name("btnK"));
		
		srchbtn.click();
		
		driver.quit();
		
	}

}
