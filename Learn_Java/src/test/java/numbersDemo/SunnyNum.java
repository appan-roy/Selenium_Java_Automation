package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A number N is called sunny number if the square root of the number N+1 is an integer number. 
 * Example:- 24 is a sunny number because 24+1 = 25 has a square root of 5 which is an integer.
 */

public class SunnyNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is sunny number or not
		if(nu.isPerfectSquare(num + 1))
			System.out.println("The number " + num + " is a sunny number");
		else
			System.out.println("The number " + num + " is not a sunny number");
		
		sc.close();
		
	}

}
