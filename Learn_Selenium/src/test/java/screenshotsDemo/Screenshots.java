package screenshotsDemo;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screenshots {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.clear();
		fname.sendKeys("Appan");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.clear();
		lname.sendKeys("Roy");
		
		WebElement sex = driver.findElement(By.xpath("//input[@name='sex'][1]"));
		sex.click();
		
		WebElement yos = driver.findElement(By.xpath("//input[@name='exp'][@value='6']"));
		yos.click();
		
		WebElement date = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[5]/div/form/table/tbody/tr[5]/td[2]/input"));
		date.clear();
		date.sendKeys("12/10/2019");
		
		WebElement profession = driver.findElement(By.xpath("//input[@name='profession'][@value='Automation Tester']"));
		profession.click();
		
		WebElement tool = driver.findElement(By.xpath("//input[@name='tool'][@value='Selenium Webdriver']"));
		tool.click();
		
		Select continent = new Select(driver.findElement(By.name("continents")));
		continent.selectByVisibleText("South America");
		
		Select selenium_cmd = new Select(driver.findElement(By.name("selenium_commands")));
		selenium_cmd.selectByVisibleText("Switch Commands");
		
		String name = driver.getTitle()+".jpg";
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(name));

	}

}
