package extentReportDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import lib.Utility;

public class ExtentReport4 {

	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("E:\\Softwares\\My PC Apps\\Selenium\\Report\\Extent Reports\\ExtentReport4.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
	}
	

	@Test
	public void testTitle() throws IOException{
		
		logger = extent.createTest("Verify Title");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.co.in/");
		
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		
	}
	
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException{
		
		if(result.getStatus()==ITestResult.FAILURE){
			
			String img = Utility.getScreenshot(driver);
			
			logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(img).build());
			
		}
		
		extent.flush();
		
		driver.quit();
		
	}

}
