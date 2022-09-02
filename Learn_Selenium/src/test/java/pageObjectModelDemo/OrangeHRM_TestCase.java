/**
 * 
 */
package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectModelDemo.LoginPage;

/**
 * @author APPAN
 *
 */
public class OrangeHRM_TestCase {
	
	@Test
	public void verifyLogin() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage login = new LoginPage(driver);
		
		login.loginToWordpress("Admin", "admin123");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
