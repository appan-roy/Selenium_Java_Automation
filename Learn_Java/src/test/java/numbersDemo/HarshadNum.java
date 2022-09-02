package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * In mathematics, a harshad number (or Niven number) in a given number base is an integer that is divisible 
 * by the sum of its digits when written in that base. E.g., 114, 117, 120, 126, 132, 133, 135, 140, 144.
 */

public class HarshadNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is harshad number or not
		if(num % nu.sumOfDigits(num) == 0)
			System.out.println("The number " + num + " is a harshad number");
		else
			System.out.println("The number " + num + " is not a harshad number");
		
		sc.close();
		
	}

}
