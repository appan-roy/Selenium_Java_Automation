package windowHandlingDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationWindowHandling {

	static String driverPath = "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\geckodriver-v0.26.0-win32\\geckodriver.exe";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		Runtime.getRuntime().exec("E:\\Softwares\\My PC Apps\\Selenium\\AutoIT\\HandleAuthentication.exe");
		
		driver.get("https://www.engprod-charter.net/");
		
	}

}
