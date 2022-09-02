package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

public class PrimeNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is prime or not
		if(nu.isPrime(num))
			System.out.println("The number " + num + " is a prime number");
		else
			System.out.println("The number " + num + " is not a prime number");
		
		sc.close();
		
	}

}
