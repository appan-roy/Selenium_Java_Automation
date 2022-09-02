package imageComparisonDemo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImages {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//declare expected image
		File expectedImgFile = new File("./images/OrangeHRMLogo.png");
		BufferedImage expectedImage = ImageIO.read(expectedImgFile);
		
		//capture logo image webelement
		WebElement logoImg = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		//take screenshot of the logo image using ashot API
		Screenshot logoImgSnap = new AShot().takeScreenshot(driver, logoImg);
		
		//get actual image
		BufferedImage actualImage = logoImgSnap.getImage();
		
		//compare the images
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
		
		if(diff.hasDiff())
			System.out.println("The images are not same");
		else
			System.out.println("The images are same");
		
		driver.quit();

	}

}
