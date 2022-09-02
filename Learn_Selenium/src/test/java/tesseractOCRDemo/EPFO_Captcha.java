package tesseractOCRDemo;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;


public class EPFO_Captcha {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\My PC Apps\\Selenium\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://passbook.epfindia.gov.in/MemberPassBook/Login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		File src = driver.findElement(By.id("captcha_id")).getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir")+"/images/epfocaptcha.png");

		FileHandler.copy(src, dest);
		
		ITesseract img = new Tesseract();
		
		String txt = img.doOCR(dest);
		
		int result;
		
		if(txt.contains("+")) {
			
			String arr[] = txt.split("[+]");
			
			String beforeOp = arr[0].replaceAll("[^0-9]", "");
			
			String afterOp = arr[1].replaceAll("[^0-9]", "");
			
			int operand1 = Integer.parseInt(beforeOp);
			
			int operand2 = Integer.parseInt(afterOp);
			
			result = operand1 + operand2;
			
		}else {
			
			String arr[] = txt.split("[-]");
			
			String beforeOp = arr[0].replaceAll("[^0-9]", "");
			
			String afterOp = arr[1].replaceAll("[^0-9]", "");
			
			int operand1 = Integer. parseInt(beforeOp);
			
			int operand2 = Integer. parseInt(afterOp);
			
			result = operand1 - operand2;
			
		}
		
		driver.findElement(By.id("captcha")).sendKeys(Integer.toString(result));
		
		Thread.sleep(1000);
		
		driver.quit();

	}

}
