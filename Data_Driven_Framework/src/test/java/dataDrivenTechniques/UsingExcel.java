package dataDrivenTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelDataConfig;


public class UsingExcel {

	WebDriver driver;
	
	@Test(dataProvider="orangeHRMData")
	public void loginToWordpress(String username, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		Thread.sleep(5000);
		
		if(driver.findElements(By.xpath("//a[@id='welcome']")).size() != 0){
			
			System.out.println("User is able to login successfully");
			
		} else{
			
			System.out.println("User is not able to login, invalid credentials");
			
		}
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	@DataProvider(name="orangeHRMData")
	public Object[][] passData() {
		
		ExcelDataConfig src = new ExcelDataConfig("E:\\Softwares\\My PC Apps\\Selenium\\Testing\\Test Data\\OrangeHRM_Login_Cred.xlsx", "Cred");
		
		int rows = src.getRowCount("Cred");
		
		Object[][] data = new Object[rows][2];
		
		for(int i = 0; i < rows; i++) {
			
			data[i][0] = src.getData(i, 0);
			data[i][1] = src.getData(i, 1);
			
		}
		
		return data;
		
	}
	
}
