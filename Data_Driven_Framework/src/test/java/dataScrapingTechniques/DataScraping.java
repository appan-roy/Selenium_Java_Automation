package dataScrapingTechniques;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataScraping {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		String txt = driver.findElement(By.xpath("//*[@id='page']/div[4]/div/div[1]/h1")).getText();
		
		System.out.println(txt);
		
		List<WebElement> chkbox = driver.findElements(By.xpath("//input[@name='tool' and @type='checkbox']"));
		
		PrintStream printStream = new PrintStream(new FileOutputStream(new File("E:\\Softwares\\My PC Apps\\Selenium\\Testing\\Test Data\\TestOutputResults.xls")));
        
		System.setOut(printStream);
		
		System.out.println("TOOLS NAME");
		
		for (int i=0; i<chkbox.size();i++)
		{
			
			System.setOut(printStream);
			
			String val = chkbox.get(i).getAttribute("value");
			
			System.out.println(val);
			
		}
		
		
	}

}
