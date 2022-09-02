package webdriverManagerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iexplorerSetup {

	public static void main(String[] args) {
		
		WebDriverManager.iedriver().setup();
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.quit();
		
	}

}
