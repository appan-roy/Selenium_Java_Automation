package dataScrapingTechniques;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Xls_Reader;

public class DataScraping2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		int rowCount = rows.size();
		
		Xls_Reader reader = new Xls_Reader("E:\\Softwares\\My PC Apps\\Selenium\\Testing\\Test Data\\Selenium - Automation Practice Form_Test Data.xlsx");
		
		if (!reader.isSheetExist("Table Data")){
			reader.addSheet("Table Data");
			reader.addColumn("Table Data", "Company Name");
			reader.addColumn("Table Data", "Contact Name");
			reader.addColumn("Table Data", "Country Name");
		}
		
		for (int i=2;i<=rowCount;i++){
			
			String companyName = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[1]")).getText();
			String contactName = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[2]")).getText();
			String countryName = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[3]")).getText();
			
			System.out.print(companyName);
			System.out.print(" ");
			System.out.print(contactName);
			System.out.print(" ");
			System.out.println(countryName);
			
			reader.setCellData("Table Data", "Company Name", i, companyName);
			reader.setCellData("Table Data", "Contact Name", i, contactName);
			reader.setCellData("Table Data", "Country Name", i, countryName);
		
		}
	}

}
