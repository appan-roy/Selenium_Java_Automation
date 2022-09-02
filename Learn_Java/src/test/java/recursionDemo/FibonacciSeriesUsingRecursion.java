package recursionDemo;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {

	//Recursive function fibonacci
	public static int fibonacci(int x) {
		
		if(x == 0)
			return 0;
		else if(x == 1)
			return 1;
		else
			return (fibonacci(x-1) + fibonacci(x-2));
		
	}
	
	
	//Driver code to find the Fibonacci Series
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms : ");
		
		int n = sc.nextInt();
		
		System.out.println("The first "+n+" terms of Fibonacci series are : ");
		
		for(int i=0; i<n; i++)
			System.out.printf("%d\t", fibonacci(i));
		
		sc.close();

	}

}
