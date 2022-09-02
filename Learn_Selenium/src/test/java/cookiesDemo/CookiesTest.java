package cookiesDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CookiesTest {

	WebDriver driver;
	Cookie ck;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		System.out.println("Test suite started");
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
		System.out.println("Test suite ended");
		
	}
	
	@Test(priority=1)
	public void getAllCookies() {
		
		System.out.println("Test case started");
		
		Set <Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies : "+cookies.size());
		
		for(Cookie cookie : cookies) {
			
			System.out.println(cookie.getName()+" : "+cookie.getValue());
			
		}
		
		System.out.println("Test case ended");
		
	}
	
	@Test(priority=2)
	public void getSpecificCookieByName() {
		
		System.out.println("Test case started");
		
		System.out.println(driver.manage().getCookieNamed("session-id"));
		
		System.out.println("Test case ended");
		
	}

	@Test(priority=3)
	public void addCookie() {
		
		System.out.println("Test case started");
		
		ck = new Cookie("myCookie", "987654321");
		
		driver.manage().addCookie(ck);
		
		Set <Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies : "+cookies.size());
		
		for(Cookie cookie : cookies) {
			
			System.out.println(cookie.getName()+" : "+cookie.getValue());
			
		}
		
		System.out.println("Test case ended");
		
	}
	
	@Test(priority=4)
	public void deleteCookie() {
		
		System.out.println("Test case started");
		
		driver.manage().deleteCookie(ck);
		
		Set <Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies : "+cookies.size());
		
		for(Cookie cookie : cookies) {
			
			System.out.println(cookie.getName()+" : "+cookie.getValue());
			
		}
		
		System.out.println("Test case ended");
		
	}
	
	@Test(priority=5)
	public void deleteAllCookies() {
		
		System.out.println("Test case started");
		
		driver.manage().deleteAllCookies();
		
		Set <Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("Size of cookies : "+cookies.size());
		
		System.out.println("Test case ended");
		
	}
	
}
