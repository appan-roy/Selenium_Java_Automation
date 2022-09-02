package encryptionDemo;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordEncryption {

	static WebDriver driver;
	
	static String uname = "Admin";
	static String pwd = "admin123";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id(("txtUsername"))).sendKeys(uname);
		
		driver.findElement(By.id("txtPassword")).sendKeys(decodePassword(encodePassword(pwd)));
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
		
	}
	
	static String encodePassword(String password) {
		
		byte[] encodedString = Base64.encodeBase64(password.getBytes());
		
		return new String(encodedString);
		
	}
	
	static String decodePassword(String password) {
		
		byte[] decodedString = Base64.decodeBase64(password);
		
		return new String(decodedString);
		
	}

}
