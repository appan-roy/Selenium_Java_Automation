package tooltipDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BootstrapTooltip {

	@Test
	public void checkToastMessage() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Hover over me']"))).perform();
		
		String helpText = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		
		Assert.assertTrue(helpText.contains("Hooray"));
		
		driver.quit();

	}

}
