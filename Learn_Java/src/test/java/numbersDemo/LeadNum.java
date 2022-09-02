package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A number is said to be a Lead number if the sum of even digits is equal to the sum of odd. digits of the 
 * number. For example: 6374 (6 + 4 = 3 + 7).
 */

public class LeadNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is lead number or not
		if(nu.sumOfEvenDigits(num) == nu.sumOfOddDigits(num))
			System.out.println("The number " + num + " is a lead number");
		else
			System.out.println("The number " + num + " is not a lead number");
		
		sc.close();
		
	}

}
