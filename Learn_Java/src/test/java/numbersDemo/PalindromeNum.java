package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A palindrome number is a number that is same after reverse. For example 5445, 151, 34543, 343, 171, 48984.
 */

public class PalindromeNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is palindrome or not
		if(nu.isPalindrome(num))
			System.out.println("The number " + num + " is a palindrome number");
		else
			System.out.println("The number " + num + " is not a palindrome number");
		
		sc.close();
		
	}

}
