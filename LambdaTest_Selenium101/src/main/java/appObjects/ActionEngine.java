package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilsHelper.DriverManager;

public class ActionEngine extends DriverManager {
	
	public static void setTextboxContent(By by, String text) {
		WebElement element = driver.findElement(by);
		element.clear();
		element.sendKeys(text);
	}
	
	public static void clickOnElement(By by) {
		WebElement element = driver.findElement(by);
		element.click();
	}
	
	public static String captureText(By by) {
		WebElement element = driver.findElement(by);
		if(element.getText() != null)
			return element.getText().trim();
		else
			return element.getAttribute("value").trim();
	}
	
	public static String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public static void moveSlider(By by, int range) {
		WebElement slider = driver.findElement(by);
		Dimension sliderSize = slider.getSize();
		int sliderWidth = sliderSize.getWidth();
		int xCoord = slider.getLocation().getX();
		Actions act = new Actions(driver);
		act.moveToElement(slider).clickAndHold().dragAndDropBy(slider, xCoord-sliderWidth+range, 0).release().build().perform();
	}
	
	public static void selectDrpdownByVisibleText(By by, String text) {
		WebElement element = driver.findElement(by);
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
}
