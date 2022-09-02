package pageObjects;

import org.openqa.selenium.By;
import appObjects.ActionEngine;
import base.BaseClass;

public class SimpleFormDemoPage extends BaseClass {
	
	private By errMsgTxtbx = By.xpath("//input[@id='user-message']");
	private By getChkedValBtn = By.xpath("//button[@id='showInput']");
	private By yourMsgTxt = By.xpath("//div[@id='user-message']/p[@id='message']");
	
	public String captureCurrentUrl() {
		return ActionEngine.getUrl();
	}
	
	public void enterErrorText(String text) {
		ActionEngine.setTextboxContent(errMsgTxtbx, text);
	}
	
	public void clickOnGetChkedValueBtn() {
		ActionEngine.clickOnElement(getChkedValBtn);
	}
	
	public String getTextMsg() {
		return ActionEngine.captureText(yourMsgTxt);
	}
	
}
