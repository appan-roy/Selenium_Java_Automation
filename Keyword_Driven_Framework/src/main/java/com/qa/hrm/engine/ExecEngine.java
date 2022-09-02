package com.qa.hrm.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.hrm.base.Base;

public class ExecEngine {

	public WebDriver driver;
	public Properties prop;
	
	public static Workbook workbook;
	public static Sheet sheet;
	
	public Base base;
	
	public WebElement element;
	
	public final String SCENARIO_SHEET_PATH = "./src/main/java/com/qa/hrm/scenarios/TestScenarios.xlsx";
	
	public void startExecution(String sheetName) {

		FileInputStream file = null;
		
		try {
			file = new FileInputStream(SCENARIO_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			workbook = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet = workbook.getSheet(sheetName);
		int j = 0;
		for(int i = 0; i < sheet.getLastRowNum(); i++) {
			
			try {
				
				String locatorName = sheet.getRow(i+1).getCell(j+2).toString().trim();
				String locatorValue = sheet.getRow(i+1).getCell(j+3).toString().trim();				
				String action = sheet.getRow(i+1).getCell(j+4).toString().trim();
				String value = sheet.getRow(i+1).getCell(j+5).toString().trim();
				
				//browser level operations
				switch (action) {
				case "open browser":
					
					base = new Base();
					prop = base.initProperties();
					
					if(value.isEmpty() || value.equalsIgnoreCase("NA")) {
						driver = base.initDriver(prop.getProperty("browser"));
					}else {
						driver = base.initDriver(value);
					}
					
					driver.manage().window().maximize();
					
					break;
					
				case "enter url":
					
					if(value.isEmpty() || value.equalsIgnoreCase("NA")) {
						driver.get(prop.getProperty("appURL"));
					}else {
						driver.get(value);
					}
					
					break;

				case "close browser":
					
					Thread.sleep(2000);
					
					driver.quit();
					
					break;
					
				default:
					break;
				}
				
				//application level operations
				switch (locatorName) {
				
				case "id":
					
					element = driver.findElement(By.id(locatorValue));
					
					if(action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if(action.equalsIgnoreCase("click")) {
						element.click();
					}else if(action.equalsIgnoreCase("isDisplayed")) {
						Thread.sleep(2000);
						element.isDisplayed();
					}else if(action.equalsIgnoreCase("isEnabled")) {
						element.isEnabled();
					}else if(action.equalsIgnoreCase("getText")) {
						Thread.sleep(2000);
						String elementText = element.getText();
						System.out.println("The element text is : "+elementText);
					}
					
					locatorName = null;
					break;

				case "name":
					
					element = driver.findElement(By.name(locatorValue));
					
					if(action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if(action.equalsIgnoreCase("click")) {
						element.click();
					}else if(action.equalsIgnoreCase("isDisplayed")) {
						Thread.sleep(2000);
						element.isDisplayed();
					}else if(action.equalsIgnoreCase("isEnabled")) {
						element.isEnabled();
					}else if(action.equalsIgnoreCase("getText")) {
						Thread.sleep(2000);
						String elementText = element.getText();
						System.out.println("The element text is : "+elementText);
					}
					
					locatorName = null;
					break;
					
				case "xpath":
					
					element = driver.findElement(By.xpath(locatorValue));
					
					if(action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if(action.equalsIgnoreCase("click")) {
						element.click();
					}else if(action.equalsIgnoreCase("isDisplayed")) {
						Thread.sleep(2000);
						element.isDisplayed();
					}else if(action.equalsIgnoreCase("isEnabled")) {
						element.isEnabled();
					}else if(action.equalsIgnoreCase("getText")) {
						Thread.sleep(2000);
						String elementText = element.getText();
						System.out.println("The element text is : "+elementText);
					}
					
					locatorName = null;
					break;
				
				case "className":
					
					element = driver.findElement(By.className(locatorValue));
					
					if(action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if(action.equalsIgnoreCase("click")) {
						element.click();
					}else if(action.equalsIgnoreCase("isDisplayed")) {
						Thread.sleep(2000);
						element.isDisplayed();
					}else if(action.equalsIgnoreCase("isEnabled")) {
						element.isEnabled();
					}else if(action.equalsIgnoreCase("getText")) {
						Thread.sleep(2000);
						String elementText = element.getText();
						System.out.println("The element text is : "+elementText);
					}
					
					locatorName = null;
					break;
				
				case "cssSelector":
					
					element = driver.findElement(By.cssSelector(locatorValue));
					
					if(action.equalsIgnoreCase("sendkeys")) {
						element.clear();
						element.sendKeys(value);
					}else if(action.equalsIgnoreCase("click")) {
						element.click();
					}else if(action.equalsIgnoreCase("isDisplayed")) {
						Thread.sleep(2000);
						element.isDisplayed();
					}else if(action.equalsIgnoreCase("isEnabled")) {
						element.isEnabled();
					}else if(action.equalsIgnoreCase("getText")) {
						Thread.sleep(2000);
						String elementText = element.getText();
						System.out.println("The element text is : "+elementText);
					}
					
					locatorName = null;
					break;
					
				case "linkText":
					
					element = driver.findElement(By.linkText(locatorValue));
					
					if(action.equalsIgnoreCase("click")) {
						element.click();
					}
					
					locatorName = null;
					break;
				
				case "partialLinkText":
					
					element = driver.findElement(By.partialLinkText(locatorValue));
					
					if(action.equalsIgnoreCase("click")) {
						element.click();
					}
					
					locatorName = null;
					break;
					
				default:
					break;
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
	}
	
}
