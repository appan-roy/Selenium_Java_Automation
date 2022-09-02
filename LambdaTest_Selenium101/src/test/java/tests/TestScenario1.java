package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import hooks.TestHooks;
import pageObjects.HomePage;
import pageObjects.SimpleFormDemoPage;
import utilsHelper.PageObjectManager;

public class TestScenario1 extends TestHooks {
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	HomePage homePage;
	SimpleFormDemoPage simpleFormDemoPage;

	@Test
	public void verifyUrl() {
		homePage = pageObjectManager.getHomePage();
		homePage.clickOnSimpleFormDemoLink();
		String expUrl = "simple-form-demo";
		simpleFormDemoPage = pageObjectManager.getSimpleFormDemoPage();
		String actUrl = simpleFormDemoPage.captureCurrentUrl();
		Assert.assertTrue(actUrl.contains(expUrl));
	}

	@Test(dependsOnMethods = { "verifyUrl" })
	public void verifyEnteredMessage() {
		simpleFormDemoPage = pageObjectManager.getSimpleFormDemoPage();
		String expMsg = "Welcome to LambdaTest";
		simpleFormDemoPage.enterErrorText(expMsg);
		simpleFormDemoPage.clickOnGetChkedValueBtn();
		String actMsg = simpleFormDemoPage.getTextMsg();
		Assert.assertEquals(actMsg, expMsg, "The expected message is " + expMsg + " but didn't match with actual message " + actMsg);
	}

}
