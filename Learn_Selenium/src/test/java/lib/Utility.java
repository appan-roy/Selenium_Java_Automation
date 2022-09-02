package lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, String screenshotName)
	{
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("./Screenshots/"+screenshotName+".jpg"));
			
		}
		
		catch (Exception e){
			
			System.out.println("Exception while taking screenshots"+e.getMessage());
			
		}
		
	}
	
	public static String captureSnap(WebDriver driver, String screenshotName)
	{
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			String dest = "E:\\Softwares\\My PC Apps\\Selenium\\Report\\"+screenshotName+".jpg";
			
			File destination = new File(dest);
			
			FileUtils.copyFile(source, destination);
			
			return dest;
			
		}
		
		catch (Exception e){
			
			System.out.println("Exception while taking screenshots"+e.getMessage());
			
			return e.getMessage();
			
		}
		
	}
	
	public static String getScreenshot(WebDriver driver){
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
		
		File dest = new File(path);
		
		try {
			
			FileUtils.copyFile(src, dest);
			
		} catch (IOException e) {
			
			System.out.println("Capture failed "+e.getMessage());
		
		}
		
		return path;
		
	}
	
	
}
