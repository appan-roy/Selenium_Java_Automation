package chromeOptionsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome_Options {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setAcceptInsecureCerts(true);
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		System.out.println("The title of the page is " + driver.getTitle());
		
	}

}
