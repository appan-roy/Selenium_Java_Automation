package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FileUpload {
	
	String driverPath = "E:\\Softwares\\My PC Apps\\Selenium\\Chrome Driver 2.42 win32\\chromedriver.exe";
	
	@Test
	public void fileupload() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Softwares/My%20PC%20Apps/Selenium/AutoIT/fileupload.html");
		
		driver.findElement(By.xpath("//*[@id='1']")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("E:\\Softwares\\My PC Apps\\Selenium\\AutoIT\\FileUpload.exe");

	}
	
}
