package elementsHandlingDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
		for (int i = 0; i < dropdown.size(); i++){
			
			WebElement elm = dropdown.get(i);
			
			String innerhtml = elm.getAttribute("innerHTML");
			
			if (innerhtml.contentEquals("JavaScript")){
				
				elm.click();
				break;
				
			}
			
			System.out.println("The dropdown value is "+innerhtml);
			
		}
		
	}

}
