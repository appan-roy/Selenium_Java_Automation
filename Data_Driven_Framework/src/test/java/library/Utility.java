package library;

import java.io.File;

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
	
}
