package exceptionHandlingDemo;

public class ExceptionHandling {

	//TRY CATCH WITH PRINT STACK TRACE//
	
	public static void main(String[] args) {
		
		try {
			
			int div = 10/0;
			
			System.out.println("The division result is "+div);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
