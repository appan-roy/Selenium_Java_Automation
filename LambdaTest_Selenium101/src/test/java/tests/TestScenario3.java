package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import hooks.TestHooks;
import pageObjects.HomePage;
import pageObjects.InputFormSubmitPage;
import utilsHelper.PageObjectManager;

public class TestScenario3 extends TestHooks {
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	HomePage homePage;
	InputFormSubmitPage inputFormSubmitPage;

	@Test
	public void verifyBlankSubmissionErrorMessage() {
		homePage = pageObjectManager.getHomePage();
		homePage.clickOnInputFormSubmitLink();
		inputFormSubmitPage = pageObjectManager.getInputFormSubmitPage();
		inputFormSubmitPage.clickOnSubmitBtn();
		String expErrMsg = "Please fill out this field.";
		String actErrMsg = inputFormSubmitPage.getErrToastMsg();
		Assert.assertEquals(actErrMsg, expErrMsg, "The expected error message is " + expErrMsg + " but didn't match with actual error message " + actErrMsg);
	}

	@Test(dependsOnMethods = { "verifyBlankSubmissionErrorMessage" })
	public void verifyFullSubmissionSuccessMessage() throws InterruptedException {
		inputFormSubmitPage.enterName("John Doe");
		inputFormSubmitPage.enterEmail("john.doe@rhyta.com");
		inputFormSubmitPage.enterPassword("johndoe#password");
		inputFormSubmitPage.enterCompany("ABC Corp.");
		inputFormSubmitPage.enterWebsite("www.johndoeblogspot.com");
		inputFormSubmitPage.selectCountry("United States");
		inputFormSubmitPage.enterCity("Los Angeles");
		inputFormSubmitPage.enterAddress1("1234 State Street");
		inputFormSubmitPage.enterAddress2("345C");
		inputFormSubmitPage.enterState("California");
		inputFormSubmitPage.enterZipcode("11111");
		inputFormSubmitPage.clickOnSubmitBtn();
		waitFor(2);
		String expMsg = "Thanks for contacting us, we will get back to you shortly.";
		String actMsg = inputFormSubmitPage.getSuccessMsg();
		Assert.assertEquals(actMsg, expMsg, "The expected message is " + expMsg + " but didn't match with actual message " + actMsg);
	}

}
