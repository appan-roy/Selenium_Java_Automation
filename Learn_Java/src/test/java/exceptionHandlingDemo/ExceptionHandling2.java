package exceptionHandlingDemo;

public class ExceptionHandling2 {

	//TRY CATCH WITH GET MESSAGE//
	
	public static void main(String[] args) {
		
		try {
			
			int div = 10/0;
			
			System.out.println("The division result is "+div);
			
		} catch (Exception e) {
			
			System.out.println("Please check the exception "+e.getMessage());
			
		}

	}

}
