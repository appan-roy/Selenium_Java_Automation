package loopsDemo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int number = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=number; i++) {
			
			fact = fact * i;
			
		}
		
		System.out.printf("The factorial of %d is %d", number, fact);
		
		sc.close();

	}

}
