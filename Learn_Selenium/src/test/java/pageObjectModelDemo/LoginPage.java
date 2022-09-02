/**
 * 
 */
package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author APPAN
 * 
 * This class will store all the locators and methods of login page of the demosite Orange HRM
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	By username = By.id("txtUsername");
	
	By password = By.name("txtPassword");
	
	By login_btn = By.xpath("//*[@id='btnLogin']");
	
	//This is a constructor of the class LoginPage
	
	public LoginPage(WebDriver ldriver) {
	
		this.driver = ldriver;
		
	}
	
	//This is a method of the class LoginPage
	
	public void loginToWordpress(String user, String pass) {
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login_btn).click();
		
	}

}