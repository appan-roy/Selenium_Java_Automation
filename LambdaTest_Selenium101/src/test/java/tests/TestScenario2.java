package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import hooks.TestHooks;
import pageObjects.DragDropSlidersPage;
import pageObjects.HomePage;
import utilsHelper.PageObjectManager;

public class TestScenario2 extends TestHooks {
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	HomePage homePage;
	DragDropSlidersPage dragDropSlidersPage;

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

}
