package utilsHelper;

import org.openqa.selenium.WebDriver;

import pageObjects.DragDropSlidersPage;
import pageObjects.HomePage;
import pageObjects.InputFormSubmitPage;
import pageObjects.SimpleFormDemoPage;

public class PageObjectManager {

	WebDriver driver;
	HomePage homePage;
	SimpleFormDemoPage simpleFormDemoPage;
	DragDropSlidersPage dragDropSlidersPage;
	InputFormSubmitPage inputFormSubmitPage;

	public HomePage getHomePage() {
		return homePage != null ? homePage : new HomePage();
	}
	
	public SimpleFormDemoPage getSimpleFormDemoPage() {
		return simpleFormDemoPage != null ? simpleFormDemoPage : new SimpleFormDemoPage();
	}
	
	public DragDropSlidersPage getDragDropSlidersPage() {
		return dragDropSlidersPage != null ? dragDropSlidersPage : new DragDropSlidersPage();
	}
	
	public InputFormSubmitPage getInputFormSubmitPage() {
		return inputFormSubmitPage != null ? inputFormSubmitPage : new InputFormSubmitPage();
	}
	
}
