package exceptionHandlingDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling5 {

	//BASE EXCEPTION IS THROWN HERE. IT WILL HANDLE ALL TYPES OF EXCEPTION//
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("Start");
		
		Thread.sleep(5000);
		
		System.out.println("End");
		
		FileInputStream fis = new FileInputStream("");
		
		Robot rbt = new Robot();

	}

}
