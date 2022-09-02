package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageObjects.DragDropSlidersPage;
import pageObjects.HomePage;
import utilsHelper.PageObjectManager;

public class GridTest {

	private static RemoteWebDriver driver;
	private static String Status = "failed";
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	HomePage homePage;
	DragDropSlidersPage dragDropSlidersPage;

	@BeforeClass
	public void setup() throws MalformedURLException {
		try {
			/*
			 * Take username and accesskey from
			 * https://accounts.lambdatest.com/detail/profile
			 */
			String username = "appan12345";
			String authkey = "Zk0TP5sZghq8SgLWHQt5VRitmwf0irlF6En77346eabw1xrCTV";
			String hub = "@ hub.lambdatest.com/wd/hub ";
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("browser", "Chrome");
			caps.setCapability("version", "103");
			caps.setCapability("platform", "MacOS Catalina");

			caps.setCapability("build", "LambdaException Demo");
			caps.setCapability("name", "Test 2");
			caps.setCapability("network", true);
			caps.setCapability("visual", true);
			caps.setCapability("video", true);
			caps.setCapability("console", true);
			System.out.println("Desired Caps: " + caps);
			driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);

		} catch (Exception e) {

		}
	}
	
	@Test
	public void verifySliderValue() throws InterruptedException {
		homePage = pageObjectManager.getHomePage();
		homePage.clickOnDragDropSlidersLink();
		dragDropSlidersPage = pageObjectManager.getDragDropSlidersPage();
		dragDropSlidersPage.moveRangeSlider();
		String expRange = "100";
		String actRange = dragDropSlidersPage.getAfterSlidingRange();
		Assert.assertEquals(actRange, expRange, "The actual slider range is " + actRange
				+ " but didn't match with the expected slider range " + expRange);
	}
	
	@AfterClass
    public void tearDown() throws Exception {
       if (driver != null) {
            ((JavascriptExecutor) driver).executeScript("lambda-status=" + Status);
            driver.quit();
        }
    }
}
