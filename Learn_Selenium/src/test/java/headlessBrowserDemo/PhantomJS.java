package headlessBrowserDemo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import lib.Utility;

public class PhantomJS {

	@Test
	public void test1(){
		
		File src = new File("E:\\Softwares\\My PC Apps\\Selenium\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		Utility.captureScreenshot(driver, "PhantomJSSnap");
			
	}
	
}
