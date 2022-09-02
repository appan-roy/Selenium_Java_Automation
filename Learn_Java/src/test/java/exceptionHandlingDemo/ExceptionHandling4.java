package exceptionHandlingDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling4 {

	//DIFFERENT EXCEPTIONS ARE THROWN HERE//
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, AWTException {
		
		System.out.println("Start");
		
		Thread.sleep(5000);
		
		System.out.println("End");
		
		FileInputStream fis = new FileInputStream("");
		
		Robot rbt = new Robot();

	}

}
