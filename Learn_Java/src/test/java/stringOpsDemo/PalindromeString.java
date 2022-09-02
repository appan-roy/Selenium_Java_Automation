package stringOpsDemo;

import java.util.Scanner;

import utility.StringUtils;

public class PalindromeString {

	public static void main(String[] args) {
		
		StringUtils su = new StringUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		
		String s = sc.next();
		
		if(su.isPalindrome(s))
			System.out.println("The string " + s + " is palindrome");
		else
			System.out.println("The string " + s + " is not palindrome");
		
		sc.close();

	}

}
