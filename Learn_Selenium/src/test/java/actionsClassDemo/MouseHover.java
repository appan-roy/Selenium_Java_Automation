package actionsClassDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
 
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement el = driver.findElement(By.xpath("//*[@class='dropbtn']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(el).perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//*[@class='dropdown-content']//a"));
		
		int total_links = links.size();
		
		for(int i=0;i<total_links;i++){
			
			WebElement element = links.get(i);
			
			String text = element.getText();
			
			boolean status = element.isEnabled();
			
			System.out.println("The link name is "+text+" and the status of the link is "+status);
			
			if(text.equalsIgnoreCase("Appium")){
				
				element.click();
				
				break;
				
			}
			
		}

	}

}
