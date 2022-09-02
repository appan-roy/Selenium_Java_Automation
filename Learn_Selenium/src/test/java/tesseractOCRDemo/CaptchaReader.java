package tesseractOCRDemo;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class CaptchaReader {

	static File imageFile = new File("./images/captcha.png");
	
	public static void main(String[] args) {
		
		ITesseract img = new Tesseract();
		
		try {
			
			//capture the image text
			String txt = img.doOCR(imageFile);
			
			//split the text by the string "code" and store into a string array
			String arr[] = txt.split("code");
			
			//required string is replaced by blank char with regex
			String captcha = arr[1].replaceAll("[^a-zA-Z0-9]", "");
			
			//print the actual captcha string
			System.out.println(captcha);
			
		} catch (TesseractException e) {
			
			e.printStackTrace();
			
		}

	}

}
