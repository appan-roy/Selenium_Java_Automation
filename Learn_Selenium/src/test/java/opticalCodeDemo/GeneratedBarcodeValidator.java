package opticalCodeDemo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class GeneratedBarcodeValidator {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, NotFoundException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://barcode.tec-it.com/en/");
		
		//generate barcode
		String barcodeText = "Selenium Framework";
		
		WebElement barcode_Textbox = driver.findElement(By.id("Data"));
		barcode_Textbox.clear();
		barcode_Textbox.sendKeys(barcodeText);
		
		WebElement refreshBtn = driver.findElement(By.xpath("//*[@id=\"barcodeGeneratorForm\"]/div[5]/div[1]/div[1]/div[3]/a"));
		refreshBtn.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"infoTarget\"]/div[1]/a[2]")).click();
		String barcodeImageURL = driver.findElement(By.id("copyBarcodeImageUrl")).getAttribute("value");
		
		//create url from string
		URL url = new URL(barcodeImageURL);
		
		//capture the buffered image from url
		BufferedImage bufferedImg = ImageIO.read(url);
		
		//capture the luminence source from the buffered image
		LuminanceSource luminanceSrc = new BufferedImageLuminanceSource(bufferedImg);
		
		//capture binary bitmap from the luminance source
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSrc));
		
		//decode the binary bitmap
		Result result = new MultiFormatReader().decode(binaryBitmap);
		
		//get the text of the decoded result
		String extractedBarcodeText = result.getText();
		System.out.println("The barcode string is : "+extractedBarcodeText);
		
		if(extractedBarcodeText.equalsIgnoreCase(barcodeText))
			System.out.println("The barcodes match with each other");
		else
			System.out.println("The barcodes don't match with each other");
		
		driver.quit();
		
	}

}
