package pageObjects;

import org.openqa.selenium.By;
import appObjects.ActionEngine;
import base.BaseClass;

public class DragDropSlidersPage extends BaseClass {
	
	private By slider15 = By.xpath("//input[@class='sp__range'][@value='15']");
	private By afterSliding = By.xpath("//input[@class='sp__range'][@value='15']/following-sibling::output");
	
	public void moveRangeSlider() {
		ActionEngine.moveSlider(slider15, 0);
	}
	
	public String getAfterSlidingRange() {
		return ActionEngine.captureText(afterSliding);
	}
	
}
