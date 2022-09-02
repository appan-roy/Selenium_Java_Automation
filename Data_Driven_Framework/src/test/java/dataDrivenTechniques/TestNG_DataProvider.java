package dataDrivenTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {

	WebDriver driver;
	
	@Test(dataProvider="orangehrmData")
	public void loginToOrangeHRM(String username, String password) throws InterruptedException {
		
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
	
	
	@DataProvider(name="orangehrmData")
	public Object[][] passData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Admin";
		data[0][1] = "admin12";
		
		data[1][0] = "Admin";
		data[1][1] = "admin123";
		
		data[2][0] = "Admin";
		data[2][1] = "admin1234";
		
		return data;
		
	}
	
}
