package interviewQnA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyBrokenLink {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		System.out.println("Total links : " + all_links.size());
		
		for (WebElement link : all_links) {
			String currentUrl = link.getAttribute("href");
			verifyURL(currentUrl);
		}
		
		driver.quit();

	}
	
	public static void verifyURL(String linkUrl) {
		
		try {
			
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
			httpURLConnection.setConnectTimeout(1000);
			httpURLConnection.connect();
			
			if(httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK)
				System.out.println(linkUrl + " - " + httpURLConnection.getResponseMessage() + " - " + HttpURLConnection.HTTP_OK);
			else if(httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND)
				System.out.println(linkUrl + " - " + httpURLConnection.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
