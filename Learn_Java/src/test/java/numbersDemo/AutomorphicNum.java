package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number 
 * itself. For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, so 5, 6, 76 are all automorphic numbers. More ex: 25.
 */

public class AutomorphicNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is automorphic number or not
		int digits = nu.numOfDigits(num);
		int sq = nu.squareOfNum(num);

		if(sq % Math.pow(10, digits) == num)
			System.out.println("The number " + num + " is an automorphic number");
		else
			System.out.println("The number " + num + " is not an automorphic number");
		
		sc.close();
		
	}

}
