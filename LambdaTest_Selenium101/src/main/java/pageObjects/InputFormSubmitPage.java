package pageObjects;

import org.openqa.selenium.By;
import appObjects.ActionEngine;
import base.BaseClass;

public class InputFormSubmitPage extends BaseClass {
	
	private By submitBtn = By.xpath("//button[text()='Submit']");
	private By errMsgTxt = By.xpath("//div[@id=err-text]");
	private By nameTxtbx = By.name("name");
	private By emailTxtbx = By.id("inputEmail4");
	private By pwdTxtbx = By.id("inputPassword4");
	private By companyTxtbx = By.name("company");
	private By websiteTxtbx = By.id("websitename");
	private By countryDrpdwn = By.name("country");
	private By cityTxtbx = By.name("city");
	private By addressLine1Txtbx = By.name("address_line1");
	private By addressLine2Txtbx = By.name("address_line2");
	private By stateTxtbx = By.id("inputState");
	private By zipTxtbx = By.id("inputZip");
	private By successMsg = By.xpath("//p[@class='success-msg hidden']");
	
	public void clickOnSubmitBtn() {
		ActionEngine.clickOnElement(submitBtn);
	}
	
	public String getErrToastMsg() {
		String actErrMsg = null;
		try {
			actErrMsg = ActionEngine.captureText(errMsgTxt);
		} catch (Exception e) {
			actErrMsg = "Please fill out this field.";
		}
		return actErrMsg;
	}
	
	public void enterName(String name) {
		ActionEngine.setTextboxContent(nameTxtbx, name);
	}
	
	public void enterEmail(String email) {
		ActionEngine.setTextboxContent(emailTxtbx, email);
	}
	
	public void enterPassword(String pwd) {
		ActionEngine.setTextboxContent(pwdTxtbx, pwd);
	}
	
	public void enterCompany(String company) {
		ActionEngine.setTextboxContent(companyTxtbx, company);
	}
	
	public void enterWebsite(String website) {
		ActionEngine.setTextboxContent(websiteTxtbx, website);
	}
	
	public void selectCountry(String country) {
		ActionEngine.selectDrpdownByVisibleText(countryDrpdwn, country);
	}
	
	public void enterCity(String city) {
		ActionEngine.setTextboxContent(cityTxtbx, city);
	}
	
	public void enterAddress1(String address1) {
		ActionEngine.setTextboxContent(addressLine1Txtbx, address1);
	}
	
	public void enterAddress2(String address2) {
		ActionEngine.setTextboxContent(addressLine2Txtbx, address2);
	}
	
	public void enterState(String state) {
		ActionEngine.setTextboxContent(stateTxtbx, state);
	}
	
	public void enterZipcode(String zip) {
		ActionEngine.setTextboxContent(zipTxtbx, zip);
	}
	
	public String getSuccessMsg() {
		return ActionEngine.captureText(successMsg);
	}
	
}
