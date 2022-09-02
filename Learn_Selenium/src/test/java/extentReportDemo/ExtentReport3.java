package extentReportDemo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport3 {

	@Test
	public void test1() throws IOException{
		
		System.out.println("This is a dummy test for extent report version 3");
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("E:\\Softwares\\My PC Apps\\Selenium\\Report\\Extent Reports\\ExtentReport3.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		//This logger should be unique for each test and end up with the flush//
		
		//TEST CASE 1//
		
		ExtentTest logger = extent.createTest("LoginTest");
		
		logger.log(Status.INFO, "Webpage loaded");
		
		logger.log(Status.PASS, "User logged in successfully");
		
		extent.flush();
		
		//TEST CASE 2//
		
		ExtentTest logger2 = extent.createTest("LogoutTest");
		
		logger2.log(Status.INFO, "Webpage loaded");
		
		logger2.log(Status.FAIL, "User is unable to logout");
		
		logger2.fail("Failed due to some issues", MediaEntityBuilder.createScreenCaptureFromPath("E:\\Softwares\\My PC Apps\\Selenium\\Report\\Screenshots\\Capture.jpg").build());
		
		extent.flush();
		
	}

}
