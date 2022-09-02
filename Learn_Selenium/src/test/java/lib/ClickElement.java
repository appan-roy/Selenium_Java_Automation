package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

	public static void ClickById(WebDriver ldriver, String lid) {
		
		Actions act = new Actions(ldriver);
		
		act.moveToElement(ldriver.findElement(By.id(lid))).click().build().perform();

	}
	
	public static void ClickByName(WebDriver ldriver, String lname) {
		
		Actions act = new Actions(ldriver);
		
		act.moveToElement(ldriver.findElement(By.name(lname))).click().build().perform();

	}
	
	public static void ClickByXpath(WebDriver ldriver, String lxpath) {
		
		Actions act = new Actions(ldriver);
		
		act.moveToElement(ldriver.findElement(By.xpath(lxpath))).click().build().perform();

	}
	
	public static void ClickByClassName(WebDriver ldriver, String lclass) {
		
		Actions act = new Actions(ldriver);
		
		act.moveToElement(ldriver.findElement(By.className(lclass))).click().build().perform();

	}

}
