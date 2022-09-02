package utilsHelper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	protected static WebDriver driver;
	ChromeOptions chromeOptions;
	FirefoxOptions firefoxOptions;

	public void instantiateDriver() {
		switch (ConfigManager.get("Browser")) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			if (ConfigManager.get("Headless").equals("true")) {
				chromeOptions.addArguments("--headless");
				chromeOptions.addArguments("--disable-gpu");
				driver = new ChromeDriver(chromeOptions);
			} else
				driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			if (ConfigManager.get("Headless").equals("true")) {
				firefoxOptions.addArguments("--headless");
				firefoxOptions.addArguments("--disable-gpu");
				driver = new FirefoxDriver(firefoxOptions);
			} else
				driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
		driver.get(ConfigManager.get("QA_Url"));
	}
	
	public void killDriver() throws IOException {
		switch (ConfigManager.get("Browser")) {
		case "chrome":
			Runtime.getRuntime().exec("taskkill /im chromedriver /f");
			Runtime.getRuntime().exec("taskkill /im chrome /f");
			break;
		case "firefox":
			Runtime.getRuntime().exec("taskkill /im firefoxdriver /f");
			Runtime.getRuntime().exec("taskkill /im firefox /f");
			break;
		case "edge":
			Runtime.getRuntime().exec("taskkill /im msedgedriver /f");
			Runtime.getRuntime().exec("taskkill /im msedge /f");
			break;
		default:
			break;
		}
		
	}
	
	public void closeDriver() {
		if(driver != null)
			driver.quit();
	}

}
