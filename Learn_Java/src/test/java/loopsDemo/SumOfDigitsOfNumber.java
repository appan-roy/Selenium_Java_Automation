package loopsDemo;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(n>0) {
			
			int a = n%10;
			
			sum = sum+a;
			
			n = n/10;
			
		}
		
		System.out.println("The sum of the digits of the number is "+sum);

		sc.close();

	}

}
