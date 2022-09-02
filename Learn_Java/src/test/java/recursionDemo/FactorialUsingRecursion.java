package recursionDemo;

import java.util.Scanner;

public class FactorialUsingRecursion {

	//Recursive function factorial
	public static long factorial(int x) {
		
		if(x == 0)
			return 1;
		else
			return (x * factorial(x-1));
		
	}
	

	//Driver code to find the factorial
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		
		System.out.println("The factorial of "+n+" is "+factorial(n));
		
		sc.close();

	}
	
}
