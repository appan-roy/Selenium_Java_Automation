package seleniumGridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		//1. Define desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//2. Define chrome options
		ChromeOptions opt = new ChromeOptions();
		opt.merge(cap);
		
		//3. Define hub url
		String hubUrl = "http://100.120.43.232:4444";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), opt);
		
		//4. Test case
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
