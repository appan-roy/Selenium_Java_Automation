package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * In Mathematics, Handsome numbers are those number in which the sum of all the left side digit is equal to 
 * the last digit. Handsome number examples: 123, 224, 235 etc. Here 123 is Handsome number because last 
 * digit = 3 & remaining left part is 12 and sum of 1+2 is 3 i.e. 123 --> 1+2 = 3 which is last digit.
 */

public class HandsomeNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is handsome number or not
		int leftNum = num / 10;
		int rightNum = num % 10;

		if(nu.sumOfDigits(leftNum) == rightNum)
			System.out.println("The number " + num + " is a handsome number");
		else
			System.out.println("The number " + num + " is not a handsome number");
		
		sc.close();
		
	}

}
