package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A Neon Number is a positive integer, which is equal to the sum of the digits of its square. For example, 
 * 9 is a neon number, because 9^2 = 81, and the sum of the digits 8 + 1 = 9, which is same as the original 
 * number. More ex: 
 */

public class NeonNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is neon number or not
		if(nu.sumOfDigits(nu.squareOfNum(num)) == num)
			System.out.println("The number " + num + " is a neon number");
		else
			System.out.println("The number " + num + " is not a neon number");
		
		sc.close();
		
	}

}
