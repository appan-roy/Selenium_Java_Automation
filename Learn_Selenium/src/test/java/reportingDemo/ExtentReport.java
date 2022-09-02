package reportingDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	@Test
	public void titleTest() {
		
		ExtentReports logger = ExtentReports.get(ExtentReport.class);
		
		logger.init("E:\\Softwares\\My PC Apps\\Selenium\\Report\\Extent Reports\\ExtentReport1.html", true);
		
		logger.startTest("Verify Facebook Title");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		logger.log(LogStatus.INFO, "Browser is up and running");
		
		driver.get("https://www.facebook.com/");
		
		logger.log(LogStatus.INFO, "Application is up and running");
		
		String title = driver.getTitle();
		
		logger.log(LogStatus.INFO, "Title is captured");
		
		Assert.assertTrue(title.contains("Facebook"));
		
		logger.log(LogStatus.PASS, "Title is verified");
		
		logger.attachScreenshot("E:\\Softwares\\My PC Apps\\Selenium\\Report\\Screenshots\\Capture.jpg");
		
		logger.endTest();
		
	}

}
