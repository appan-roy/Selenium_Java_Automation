package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A circular prime is a prime number with the property that the number generated at each intermediate step 
 * when cyclically permuting its digits will be prime. For example, 1193 is a circular prime, since 1931, 
 * 9311 and 3119 all are also prime. More ex: 2 3 5 7 11 13 17 31 37 71 73 79 97 199 337.
 */

public class CircularPrimeNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int flag = 0;
		
		// check the number is circular prime or not
		if(nu.isPrime(num)) {
			
			int digits = nu.numOfDigits(num);
			
			for(int i = 1; i < digits; i++) {
				
				if(! nu.isPrime(nu.shiftLeft(num))) {
					flag = 1;
					break;
				}else
					continue;
				
			}
			
		}else
			flag = 2;
		
		
		if(flag == 0)
			System.out.println("The number " + num + " is a circular prime number");
		else if(flag == 1)
			System.out.println("The number " + num + " is not a circular prime number");
		else
			System.out.println("The number " + num + " is not a prime number");
		
		sc.close();
		
	}

}
