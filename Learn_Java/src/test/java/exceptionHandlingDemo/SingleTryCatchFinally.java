package exceptionHandlingDemo;

public class SingleTryCatchFinally {

	//In this case, try block should have arithmeticexception but it is not caught in catch block, the catch
	//block contains nullpointerexception, so exception will be thrown but not not be caught and
	//finally block will be executed always.
	
	public static void main(String[] args) {
		
		try {
			System.out.println("This is try block");
			int div = 10/0;
			System.out.println("The division result is "+div);
		} catch (NullPointerException e) {
			System.out.println("This is catch block");
		}finally {
			System.out.println("This is finally block");
		}

	}

}
