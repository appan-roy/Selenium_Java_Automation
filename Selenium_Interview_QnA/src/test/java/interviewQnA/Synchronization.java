package interviewQnA;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// driver level sync
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		// element level sync
		// implicit wait / global wait for all elements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		// explicit wait / webdriver wait
		WebDriverWait wait = new WebDriverWait(driver, 30);	// this is deprecated in selenium 4 dependency
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		
		// fluent wait
		FluentWait<WebDriver> f_wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(Exception.class);
		
		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>(){
			@Override
			public Boolean apply(WebDriver driver) {
				WebElement element = driver.findElement(By.name("q"));
				if(element != null)
					return true;
				else
					return false;
			}
		};
		
		try {
			f_wait.until(function);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
