package opticalCodeDemo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeReader {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, NotFoundException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//capture barcode url from the webelement
		String barcodeURL = driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]")).getAttribute("src");

		//create url from string
		URL url = new URL(barcodeURL);
		
		//capture the buffered image from url
		BufferedImage bufferedImg = ImageIO.read(url);
		
		//capture the luminence source from the buffered image
		LuminanceSource luminanceSrc = new BufferedImageLuminanceSource(bufferedImg);
		
		//capture binary bitmap from the luminance source
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSrc));
		
		//decode the binary bitmap
		Result result = new MultiFormatReader().decode(binaryBitmap);
		
		//get the text of the decoded result
		System.out.println("The barcode string is : "+result.getText());
		
		driver.quit();
		
	}

}
