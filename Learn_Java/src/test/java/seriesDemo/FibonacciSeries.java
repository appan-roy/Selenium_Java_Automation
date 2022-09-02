package seriesDemo;

import java.util.Scanner;

//Fibonacci Series : 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of terms: ");
		
		int number = sc.nextInt();
		
		int f1 = 1, f2 = 0, f3 = 0;
		
		System.out.println("The fibonacci series is : ");
		for(int i=0; i<number; i++) {
			
			f3 = f1 + f2;
			
			System.out.print(f3+", ");
			
			f1 = f2;
			
			f2 = f3;
			
		}
		
		sc.close();

	}

}
