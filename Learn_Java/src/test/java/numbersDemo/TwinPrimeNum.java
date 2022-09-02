package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * Twin Primes are the prime numbers with a difference of 2, e.g., 
 * (3, 5), (5, 7), (11, 13), (17, 19), (29, 31) ... etc
 */

public class TwinPrimeNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// check the numbers are twin-prime or not
		if(nu.isPrime(num1) && nu.isPrime(num2)) {
			
			if(Math.abs(num1-num2) == 2)
				System.out.println("The numbers are twin prime");
			else
				System.out.println("The numbers are not twin prime");
			
		} else {
			
			System.out.println("Either one or both numbers are not prime");
			
		}

		sc.close();
		
	}

}
