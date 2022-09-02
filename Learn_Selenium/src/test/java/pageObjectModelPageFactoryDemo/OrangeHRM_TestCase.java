package pageObjectModelPageFactoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModelPageFactoryDemo.LoginPage;
import lib.BrowserFactory;

public class OrangeHRM_TestCase {

	@Test
	public void checkValidUser() {
		
		//Launching browser with specific url
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://opensource-demo.orangehrmlive.com/");
		
		//Created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		
		//Login to the specific webpage
		login_page.loginWordpress("Admin", "admin123");
		
	}
	
}
