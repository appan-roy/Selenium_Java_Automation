package baseClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginClass extends BaseClass {

	@Test(description="This test will perform invalid login")
	public void invalidLogin(){
		
		WebElement uid = driver.findElement(By.id("user_login"));
		uid.clear();
		uid.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.id("user_pass"));
		pwd.clear();
		pwd.sendKeys("demo1234");
		
		WebElement login_btn = driver.findElement(By.id("wp-submit"));
		login_btn.click();
		
		Reporter.log("========User is unable to log in=========", true);
		
	}
	
	
	@Test(description="This test will perform valid login")
	public void validLogin(){
		
		WebElement uid = driver.findElement(By.id("user_login"));
		uid.clear();
		uid.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.id("user_pass"));
		pwd.clear();
		pwd.sendKeys("demo123");
		
		WebElement login_btn = driver.findElement(By.id("wp-submit"));
		login_btn.click();
		
		Reporter.log("========User logged in=========", true);
		
	}
	
}
