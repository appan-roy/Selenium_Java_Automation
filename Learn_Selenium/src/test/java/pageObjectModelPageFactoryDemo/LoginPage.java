package pageObjectModelPageFactoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	//This is a constructor of the class LoginPage
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver = ldriver;
		
	}
	
	//Use @CacheLookup if you are sure that the webelement never changes, otherwise don't use it
	
	@FindBy(id="txtUsername") WebElement username;
	@CacheLookup
	
	@FindBy(how=How.ID,using="txtPassword") WebElement password;
	@CacheLookup
	
	@FindBy(how=How.NAME,using="Submit") WebElement login_btn;
	@CacheLookup
	
	@FindBy(how=How.LINK_TEXT,using="Forgot your password?") WebElement forgot_pwd;
	
		
	//This is a method of the class LoginPage
	
	public void loginWordpress(String uid, String pwd) {
		
		username.sendKeys(uid);
		
		password.sendKeys(pwd);
		
		login_btn.click();
		
	}
	
	
}
