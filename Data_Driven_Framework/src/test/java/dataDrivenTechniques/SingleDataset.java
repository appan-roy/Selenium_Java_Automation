package dataDrivenTechniques;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDataset {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
		
		File src = new File("E:\\Softwares\\My PC Apps\\Selenium\\Testing\\Test Data\\Selenium - Automation Practice Form_Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wrkbk = new XSSFWorkbook(fis);
		
		XSSFSheet sht1 = wrkbk.getSheet("TutorialsPoint DataSheet");
		
		String first_name = sht1.getRow(2).getCell(0).getStringCellValue();
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.clear();
		fname.sendKeys(sht1.getRow(2).getCell(0).getStringCellValue());
		
		String last_name = sht1.getRow(2).getCell(1).getStringCellValue();
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.clear();
		lname.sendKeys(sht1.getRow(2).getCell(1).getStringCellValue());
		
		String sex = sht1.getRow(2).getCell(2).getStringCellValue();
				
		if (sex.equals("Male")){
			WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
			male.click();
		}
		else if (sex.equals("Female")){
			WebElement female = driver.findElement(By.xpath("//input[@value='Female']"));
			female.click();
		}
				
		double yrsofexp = sht1.getRow(2).getCell(3).getNumericCellValue();
		
		if (yrsofexp == 1){
			WebElement yoe1 = driver.findElement(By.xpath("//input[@value='1']"));
			yoe1.click();
		}
		else if (yrsofexp == 2){
			WebElement yoe2 = driver.findElement(By.xpath("//input[@value='2']"));
			yoe2.click();
		}
		else if (yrsofexp == 3){
			WebElement yoe3 = driver.findElement(By.xpath("//input[@value='3']"));
			yoe3.click();
		}
		else if (yrsofexp == 4){
			WebElement yoe4 = driver.findElement(By.xpath("//input[@value='4']"));
			yoe4.click();
		}
		else if (yrsofexp == 5){
			WebElement yoe5 = driver.findElement(By.xpath("//input[@value='5']"));
			yoe5.click();
		}
		else if (yrsofexp == 6){
			WebElement yoe6 = driver.findElement(By.xpath("//input[@value='6']"));
			yoe6.click();
		}
		else if (yrsofexp == 7){
			WebElement yoe7 = driver.findElement(By.xpath("//input[@value='7']"));
			yoe7.click();
		}
		
		WebElement date = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[5]/div/form/table/tbody/tr[5]/td[2]/input"));
		date.clear();
		date.sendKeys(sht1.getRow(2).getCell(4).getStringCellValue());
		
		String manual = sht1.getRow(2).getCell(5).getStringCellValue();
		String automation = sht1.getRow(2).getCell(6).getStringCellValue();
		
		if (manual.equalsIgnoreCase("Y") && automation.equalsIgnoreCase("N")){
			WebElement prof_manual = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
			prof_manual.click();
		}
		else if (manual.equalsIgnoreCase("N")&& automation.equalsIgnoreCase("Y")){
			WebElement prof_auto = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
			prof_auto.click();
		}
		else if (manual.equalsIgnoreCase("Y")&& automation.equalsIgnoreCase("Y")){
			WebElement prof_manual = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
			prof_manual.click();
			WebElement prof_auto = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
			prof_auto.click();
		}
		
		String rc = sht1.getRow(2).getCell(7).getStringCellValue();
		String ide = sht1.getRow(2).getCell(8).getStringCellValue();
		String wdriver = sht1.getRow(2).getCell(9).getStringCellValue();
		
		if (rc.equalsIgnoreCase("Y") && ide.equalsIgnoreCase("N") && wdriver.equalsIgnoreCase("N")){
			WebElement toolrc = driver.findElement(By.xpath("//input[@value='RC']"));
			toolrc.click();
		}
		else if (rc.equalsIgnoreCase("N") && ide.equalsIgnoreCase("Y") && wdriver.equalsIgnoreCase("N")){
			WebElement toolide = driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
			toolide.click();
		}
		else if (rc.equalsIgnoreCase("N") && ide.equalsIgnoreCase("N") && wdriver.equalsIgnoreCase("Y")){
			WebElement toolwd = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
			toolwd.click();
		}
		else if (rc.equalsIgnoreCase("Y") && ide.equalsIgnoreCase("Y") && wdriver.equalsIgnoreCase("N")){
			WebElement toolrc = driver.findElement(By.xpath("//input[@value='RC']"));
			toolrc.click();
			WebElement toolide = driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
			toolide.click();
		}
		else if (rc.equalsIgnoreCase("Y") && ide.equalsIgnoreCase("N") && wdriver.equalsIgnoreCase("Y")){
			WebElement toolrc = driver.findElement(By.xpath("//input[@value='RC']"));
			toolrc.click();
			WebElement toolwd = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
			toolwd.click();
		}
		else if (rc.equalsIgnoreCase("N") && ide.equalsIgnoreCase("Y") && wdriver.equalsIgnoreCase("Y")){
			WebElement toolide = driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
			toolide.click();
			WebElement toolwd = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
			toolwd.click();
		}
		else if (rc.equalsIgnoreCase("Y") && ide.equalsIgnoreCase("Y") && wdriver.equalsIgnoreCase("Y")){
			WebElement toolrc = driver.findElement(By.xpath("//input[@value='RC']"));
			toolrc.click();
			WebElement toolide = driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
			toolide.click();
			WebElement toolwd = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
			toolwd.click();
		}
		
		String cont = sht1.getRow(2).getCell(10).getStringCellValue();
		
		if (cont.equals("Asia")){
			Select continent = new Select(driver.findElement(By.name("continents")));
			continent.selectByVisibleText("Asia");
		}
		else if (cont.equals("Europe")){
			Select continent = new Select(driver.findElement(By.name("continents")));
			continent.selectByVisibleText("Europe");
		}
		else if (cont.equals("Africa")){
			Select continent = new Select(driver.findElement(By.name("continents")));
			continent.selectByVisibleText("Africa");
		}
		else if (cont.equals("Australia")){
			Select continent = new Select(driver.findElement(By.name("continents")));
			continent.selectByVisibleText("Australia");
		}
		else if (cont.equals("South America")){
			Select continent = new Select(driver.findElement(By.name("continents")));
			continent.selectByVisibleText("South America");
		}
		else if (cont.equals("North America")){
			Select continent = new Select(driver.findElement(By.name("continents")));
			continent.selectByVisibleText("North America");
		}
		else if (cont.equals("Antarctica")){
			Select continent = new Select(driver.findElement(By.name("continents")));
			continent.selectByVisibleText("Antarctica");
		}
		
		String cmd = sht1.getRow(2).getCell(11).getStringCellValue();
		
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
		
		String snap_name = first_name + " " + last_name + ".jpg";
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(snap_name));
		
		WebElement submit_btn = driver.findElement(By.name("submit"));
		submit_btn.submit();
			
		wrkbk.close();
		
	}	
	
}	
