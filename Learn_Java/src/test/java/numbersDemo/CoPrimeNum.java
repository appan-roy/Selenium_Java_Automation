package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * Two integers a and b are said to be relatively prime, mutually prime, or coprime if the only positive 
 * integer that divides both of them is 1. Co prime numbers are those whose HCF is 1.
 */

public class CoPrimeNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// check the numbers are co-prime or not
		if(nu.hcfOfTwoNumbers(num1, num2) == 1)
			System.out.println("The numbers are co prime");
		else
			System.out.println("The numbers are not co prime");
		
		sc.close();
		
	}

}
