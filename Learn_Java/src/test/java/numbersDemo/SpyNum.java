package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A spy number is a number where the sum of its digits equals the product of its digits. For example, 
 * 1124 is a spy number, the sum of its digits is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.
 * More ex: 22, 123.
 */

public class SpyNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is spy number or not
		if(nu.sumOfDigits(num) == nu.productOfDigits(num))
			System.out.println("The number " + num + " is a spy number");
		else
			System.out.println("The number " + num + " is not a spy number");
		
		sc.close();
		
	}

}
