package loopsDemo;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int number = sc.nextInt();
		
		int r = 0, d;
		
		d = number;
		
		while(d != 0) {
			
			r*=10;
			r+=d%10;
			d/=10;
			
		}
		
		if(r == number) {
			System.out.println("The number "+number+" is palindrome");
		}else {
			System.out.println("The number "+number+" is not palindrome");
		}
		
		sc.close();

	}

}
