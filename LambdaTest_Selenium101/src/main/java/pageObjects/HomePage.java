package pageObjects;

import org.openqa.selenium.By;

import appObjects.ActionEngine;
import base.BaseClass;

public class HomePage extends BaseClass {

	private By simpleFormDemoLink = By.xpath("//a[text()='Simple Form Demo']");
	private By dragDropSlidersLink = By.xpath("//a[text()='Drag & Drop Sliders']");
	private By inputFormSubmitLink = By.xpath("//a[text()='Input Form Submit']");
	
	public void clickOnSimpleFormDemoLink() {
		ActionEngine.clickOnElement(simpleFormDemoLink);
	}
	
	public void clickOnDragDropSlidersLink() {
		ActionEngine.clickOnElement(dragDropSlidersLink);
	}
	
	public void clickOnInputFormSubmitLink() {
		ActionEngine.clickOnElement(inputFormSubmitLink);
	}
	
}
