package dataDrivenTechniques;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import library.Utility;

public class MultipleDataset {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("ACCEPT")).click();
		
		File src = new File("E:\\Softwares\\My PC Apps\\Selenium\\Testing\\Test Data\\Selenium - Automation Practice Form_Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wrkbk = new XSSFWorkbook(fis);
		
		XSSFSheet sht1 = wrkbk.getSheet("ToolsQA DataSheet");
		
		int rowcount = wrkbk.getSheet("ToolsQA DataSheet").getLastRowNum();
		
		for (int i=2; i<=rowcount; i++){
			
			String first_name = sht1.getRow(i).getCell(0).getStringCellValue();
			WebElement fname = driver.findElement(By.name("firstname"));
			fname.clear();
			fname.sendKeys(first_name);
			
			String last_name = sht1.getRow(i).getCell(1).getStringCellValue();
			WebElement lname = driver.findElement(By.id("lastname"));
			lname.clear();
			lname.sendKeys(last_name);
			
			String snap_name = first_name + " " + last_name; 
			
			String sex = sht1.getRow(i).getCell(2).getStringCellValue();
			
			if (sex.equals("Male")){
				WebElement male = driver.findElement(By.xpath("//*[@id='sex-0']"));
				male.click();
			}
			else if (sex.equals("Female")){
				WebElement female = driver.findElement(By.xpath("//*[@id='sex-1']"));
				female.click();
			}
			
			double yrsofexp = sht1.getRow(i).getCell(3).getNumericCellValue();
			
			if (yrsofexp == 1){
				WebElement yoe1 = driver.findElement(By.xpath("//*[@id='exp-0']"));
				yoe1.click();
			}
			else if (yrsofexp == 2){
				WebElement yoe2 = driver.findElement(By.xpath("//*[@id='exp-1']"));
				yoe2.click();
			}
			else if (yrsofexp == 3){
				WebElement yoe3 = driver.findElement(By.xpath("//*[@id='exp-2']"));
				yoe3.click();
			}
			else if (yrsofexp == 4){
				WebElement yoe4 = driver.findElement(By.xpath("//*[@id='exp-3']"));
				yoe4.click();
			}
			else if (yrsofexp == 5){
				WebElement yoe5 = driver.findElement(By.xpath("//*[@id='exp-4']"));
				yoe5.click();
			}
			else if (yrsofexp == 6){
				WebElement yoe6 = driver.findElement(By.xpath("//*[@id='exp-5']"));
				yoe6.click();
			}
			else if (yrsofexp == 7){
				WebElement yoe7 = driver.findElement(By.xpath("//*[@id='exp-6']"));
				yoe7.click();
			}
			
			Utility.captureScreenshot(driver, snap_name+"_1");
			
			WebElement date = driver.findElement(By.xpath("//*[@id='datepicker']"));
			date.clear();
			date.sendKeys(sht1.getRow(i).getCell(4).getStringCellValue());
			
			String manual = sht1.getRow(i).getCell(5).getStringCellValue();
			String automation = sht1.getRow(i).getCell(6).getStringCellValue();
							
			if (manual.equalsIgnoreCase("Y") && automation.equalsIgnoreCase("N")){
				WebElement prof_manual = driver.findElement(By.xpath("//*[@id='profession-0']"));
				prof_manual.click();
			}
			else if (manual.equalsIgnoreCase("N")&& automation.equalsIgnoreCase("Y")){
				WebElement prof_auto = driver.findElement(By.xpath("//*[@id='profession-1']"));
				prof_auto.click();
			}
			else if (manual.equalsIgnoreCase("Y")&& automation.equalsIgnoreCase("Y")){
				WebElement prof_manual = driver.findElement(By.xpath("//*[@id='profession-0']"));
				prof_manual.click();
				WebElement prof_auto = driver.findElement(By.xpath("//*[@id='profession-1']"));
				prof_auto.click();
			}
			
			Utility.captureScreenshot(driver, snap_name+"_2");
			
			String qtp = sht1.getRow(i).getCell(7).getStringCellValue();
			String ide = sht1.getRow(i).getCell(8).getStringCellValue();
			String wdriver = sht1.getRow(i).getCell(9).getStringCellValue();
			
			if (qtp.equalsIgnoreCase("Y") && ide.equalsIgnoreCase("N") && wdriver.equalsIgnoreCase("N")){
				WebElement toolqtp = driver.findElement(By.xpath("//*[@id='tool-0']"));
				toolqtp.click();
			}
			else if (qtp.equalsIgnoreCase("N") && ide.equalsIgnoreCase("Y") && wdriver.equalsIgnoreCase("N")){
				WebElement toolide = driver.findElement(By.xpath("//*[@id='tool-1']"));
				toolide.click();
			}
			else if (qtp.equalsIgnoreCase("N") && ide.equalsIgnoreCase("N") && wdriver.equalsIgnoreCase("Y")){
				WebElement toolwd = driver.findElement(By.xpath("//*[@id='tool-2']"));
				toolwd.click();
			}
			else if (qtp.equalsIgnoreCase("Y") && ide.equalsIgnoreCase("Y") && wdriver.equalsIgnoreCase("N")){
				WebElement toolqtp = driver.findElement(By.xpath("//*[@id='tool-0']"));
				toolqtp.click();
				WebElement toolide = driver.findElement(By.xpath("//*[@id='tool-1']"));
				toolide.click();
			}
			else if (qtp.equalsIgnoreCase("Y") && ide.equalsIgnoreCase("N") && wdriver.equalsIgnoreCase("Y")){
				WebElement toolqtp = driver.findElement(By.xpath("//*[@id='tool-0']"));
				toolqtp.click();
				WebElement toolwd = driver.findElement(By.xpath("//*[@id='tool-2']"));
				toolwd.click();
			}
			else if (qtp.equalsIgnoreCase("N") && ide.equalsIgnoreCase("Y") && wdriver.equalsIgnoreCase("Y")){
				WebElement toolide = driver.findElement(By.xpath("//*[@id='tool-1']"));
				toolide.click();
				WebElement toolwd = driver.findElement(By.xpath("//*[@id='tool-2']"));
				toolwd.click();
			}
			else if (qtp.equalsIgnoreCase("Y") && ide.equalsIgnoreCase("Y") && wdriver.equalsIgnoreCase("Y")){
				WebElement toolqtp = driver.findElement(By.xpath("//*[@id='tool-0']"));
				toolqtp.click();
				WebElement toolide = driver.findElement(By.xpath("//*[@id='tool-1']"));
				toolide.click();
				WebElement toolwd = driver.findElement(By.xpath("//*[@id='tool-2']"));
				toolwd.click();
			}
			
			String cont = sht1.getRow(i).getCell(10).getStringCellValue();
			
			if (cont.equals("Asia")){
				Select continent = new Select(driver.findElement(By.id("continents")));
				continent.selectByValue("AS");
			}
			else if (cont.equals("Europe")){
				Select continent = new Select(driver.findElement(By.id("continents")));
				continent.selectByValue("EU");
			}
			else if (cont.equals("Africa")){
				Select continent = new Select(driver.findElement(By.id("continents")));
				continent.selectByValue("AF");
			}
			else if (cont.equals("Australia")){
				Select continent = new Select(driver.findElement(By.id("continents")));
				continent.selectByValue("AUS");
			}
			else if (cont.equals("South America")){
				Select continent = new Select(driver.findElement(By.id("continents")));
				continent.selectByValue("SA");
			}
			else if (cont.equals("North America")){
				Select continent = new Select(driver.findElement(By.id("continents")));
				continent.selectByValue("NA");
			}
			else if (cont.equals("Antarctica")){
				Select continent = new Select(driver.findElement(By.id("continents")));
				continent.selectByValue("AN");
			}
			
			String cmd = sht1.getRow(i).getCell(11).getStringCellValue();
			
			if (cmd.equals("Browser Commands")){
				Select selenium_cmd = new Select(driver.findElement(By.name("selenium_commands")));
				selenium_cmd.selectByVisibleText("Browser Commands");
			}
			else if (cmd.equals("Navigation Commands")){
				Select selenium_cmd = new Select(driver.findElement(By.name("selenium_commands")));
				selenium_cmd.selectByVisibleText("Navigation Commands");
			}
			else if (cmd.equals("Switch Commands")){
				Select selenium_cmd = new Select(driver.findElement(By.name("selenium_commands")));
				selenium_cmd.selectByVisibleText("Switch Commands");
			}
			else if (cmd.equals("Wait Commands")){
				Select selenium_cmd = new Select(driver.findElement(By.name("selenium_commands")));
				selenium_cmd.selectByVisibleText("Wait Commands");
			}
			else if (cmd.equals("WebElement Commands")){
				Select selenium_cmd = new Select(driver.findElement(By.name("selenium_commands")));
				selenium_cmd.selectByVisibleText("WebElement Commands");
			}
			
			Utility.captureScreenshot(driver, snap_name+"_3");
			
			WebElement submit_btn = driver.findElement(By.id("submit"));
			submit_btn.click();
			
			sht1.getRow(i).createCell(12).setCellValue("Pass");
			
			FileOutputStream fos = new FileOutputStream(src);
			
			wrkbk.write(fos);
			
		}
	
		wrkbk.close();

	}

}
