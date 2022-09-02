package hashMapDemo;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	static HashMap <String, String> loginData(){
		
		HashMap <String, String> hMap = new HashMap <String, String>();
		
		//keep the separator as @
		hMap.put("ADMIN", "Admin@admin123");
		hMap.put("IT", "It@it123");
		hMap.put("ACCOUNT", "Acc@acc123");
		hMap.put("HR", "Hr@hr123");
		
		return hMap;
		
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Login as ADMIN
		String credentials = loginData().get("ADMIN");
		String arr[] = credentials.split("@");
		
		driver.findElement(By.id("txtUsername")).sendKeys(arr[0]);
		driver.findElement(By.id("txtPassword")).sendKeys(arr[1]);
		driver.findElement(By.id("btnLogin")).click();
		
		//validation
		String dashboard = driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")).getText();
		
		if(dashboard.equalsIgnoreCase("Dashboard"))
			System.out.println("Login successful");
		else
			System.out.println("Login failed");
		
		driver.quit();

	}

}
