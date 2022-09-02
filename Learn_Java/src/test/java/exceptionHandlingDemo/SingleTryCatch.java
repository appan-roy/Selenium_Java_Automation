package exceptionHandlingDemo;

public class SingleTryCatch {
	
	public static void main(String[] args) {
		
		try {
			
			int div = 10/0;
			
			System.out.println("The division result is "+div);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Please check the exception "+e.getMessage());
			
		}

	}

}
