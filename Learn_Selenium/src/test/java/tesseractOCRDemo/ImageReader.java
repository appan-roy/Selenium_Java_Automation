package tesseractOCRDemo;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageReader {

	static File imageFile = new File("./images/badslide.png");
	
	public static void main(String[] args) {
		
		ITesseract img = new Tesseract();
		
		try {
			
			String txt = img.doOCR(imageFile);
			
			System.out.println(txt);
			
		} catch (TesseractException e) {
			
			e.printStackTrace();
			
		}

	}

}
