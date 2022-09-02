package headlessBrowserDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HTMLUnit {
	
	@Test
	public void test1(){
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.facebook.com");
		
		String fb_title = driver.getTitle();
		
		Assert.assertTrue(fb_title.contains("Facebook"));
			
	}
	
	@Test
	public void test2(){
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.facebook.com");
		
		String fb_title = driver.getTitle();
		
		Assert.assertTrue(fb_title.contains("Selenium"));
			
	}

}
