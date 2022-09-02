package elementsHandlingDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		//initialize check in and check out date
		String checkInDate = "23 August, 2021";
		
		//separate date, month and year
		String chkInArr[] = checkInDate.split(" ", 2);
		String chkInDate = chkInArr[0].trim();
		String chkInMonthYearArr [] = chkInArr[1].split(",");
		String chkInMonth = chkInMonthYearArr[0].trim();
		String chkInYear = chkInMonthYearArr[1].trim();
				
		//launch application
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//click on datepicker
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
			
			//get datepicker year
			String ChkInYear = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
			
			//check if year matches with the desired year
			if(ChkInYear.equals(chkInYear)) {
				
				//get datepicker month
				String ChkInMonth = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
				
				//check if month matches with the desired month
				if(ChkInMonth.equals(chkInMonth))
					break;
				else
					driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
				
			}else if(Integer.parseInt(ChkInYear) < Integer.parseInt(chkInYear))
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			else
				System.out.println("Please use a present or future year");

		}
		
		//click on desired date
		WebElement date = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a[contains(text(),"+chkInDate+")]"));
		jse.executeScript("arguments[0].click();", date);
		
	}

}
