package exceptionHandlingDemo;

import java.util.InputMismatchException;

public class MultiTryCatchFinally {

	//MULTI TRY-CATCH BLOCK WITH FINALLY//
	
	public static void main(String[] args) {
		
		try {
			
			int div = 10/0;
			
			System.out.println("The division result is "+div);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Please check the exception "+e.getMessage());
			
		} catch (InputMismatchException e) {
			
			System.out.println("Please check the exception "+e.getMessage());
			
		} catch (Exception e) {
			
			System.out.println("Please check the exception "+e.getMessage());
			
		} finally {
			
			System.out.println("Exceptions are handled");
			
		}

	}

}
