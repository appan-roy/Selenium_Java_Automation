package stringOpsDemo;

import java.util.Scanner;

import utility.StringUtils;

public class NumOfOccurenceOfChar {

	public static void main(String[] args) {
		
		StringUtils su = new StringUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		
		String s = sc.next();
		
		System.out.println("Enter the character you want to search : ");
		
		String c = sc.next();
		
		int n = su.numOfOccurenceOfChar(s, c);
		
		if(n == 0)
			System.out.println("The character " + c + " is not present in the string " + s);
		else if(n == 1)
			System.out.println("The character " + c + " occurred once in the string " + s);
		else
			System.out.println("The character " + c + " occurred " + n + " times in the string " + s);
		
		sc.close();

	}

}
