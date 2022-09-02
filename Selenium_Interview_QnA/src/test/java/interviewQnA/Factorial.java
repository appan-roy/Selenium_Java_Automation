package interviewQnA;

public class Factorial {

	public static void main(String[] args) {
		
		// Method 1
		int num = 5;
		long fact = 1;
		
		while(num != 0) {
			fact = fact * num;
			num--;
		}

		System.out.println("Factorial is " + fact);
		
		// Method 2 - using recursion
		int num2 = 5;
		System.out.println("factorial is " + factorial(num2));
		
	}
	
	public static long factorial(int x) {
		if(x == 0)return 1;
		else return x * factorial(x-1);
	}

}
