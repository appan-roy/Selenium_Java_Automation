package hooks;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import base.BaseClass;

public class TestHooks extends BaseClass {

	@BeforeSuite
	public void suiteSetup() throws IOException {
		killBrowser();
	}
	
	@BeforeClass
	public void classSetup() {
		openBrowser();
	}
	
	@BeforeTest
	public void testSetup() {
		
	}
	
	@AfterTest
	public void testTeardown() {
		
	}
	
	@AfterClass
	public void classTeardown() {
		closeBrowser();
	}
	
	@AfterSuite
	public void suiteTeardown() {
		
	}
	
}
