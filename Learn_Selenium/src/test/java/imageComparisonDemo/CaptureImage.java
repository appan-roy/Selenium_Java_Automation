package imageComparisonDemo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureImage {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//capture logo image webelement
		WebElement logoImg = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		//take screenshot of the logo image using ashot API
		Screenshot logoImgSnap = new AShot().takeScreenshot(driver, logoImg);
		
		//store image
		File file = new File("./images/OrangeHRMLogo.png");
		ImageIO.write(logoImgSnap.getImage(), "png", file);
		
		//check image file is created or not
		if(file.exists())
			System.out.println("The image file is created");
		else
			System.out.println("The image file is not created");
		
		driver.quit();

	}

}
