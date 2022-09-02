package stringOpsDemo;

import java.util.Scanner;

import utility.StringUtils;

public class ReverseOfString {

	public static void main(String[] args) {
		
		StringUtils su = new StringUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		
		String s = sc.next();
		
		String revStr = su.reverseString(s);
		
		System.out.println("The reverse of the string " + s + " is " + revStr);
		
		sc.close();

	}

}
