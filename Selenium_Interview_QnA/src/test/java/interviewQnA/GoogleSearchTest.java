package interviewQnA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
		Runtime.getRuntime().exec("taskkill /IM chrome.exe /F");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("COVID-19", Keys.ENTER);

		List<WebElement> tabs = driver.findElements(By.xpath(".//a[@class='hide-focus-ring']"));

		for (WebElement tab : tabs) {
			if (tab.getText().toString().trim().contains("News")) {
				tab.click();
				break;
			}
		}

		List<WebElement> agencies = driver.findElements(By.xpath(".//div[@class='XTjFC WF4CUc']"));

		List<String> agy_names = new ArrayList<String>();

		for (WebElement ele : agencies) {
			agy_names.add(ele.getText().toString().trim());
		}

		if (agy_names.size() < 3) {
			System.out.println("Missing Leading News Agencies");
		} else {
			for (String agy : agy_names) {
				System.out.println(agy);
			}
		}

		driver.quit();

	}

}
