package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A Smith Number is a composite number whose sum of digits is equal to the sum of digits in its prime 
 * factorization. Prime factorization of 666 = 2, 3, 3, 37 and 2 + 3 + 3 + (3 + 7) = 6 + 6 + 6 = 18.
 * Therefore, 666 is a smith number. More ex: 4 22 27 58 85 94 121 166 202 265 274 319 346 355 378 
 * 382 391 438 454 483.
 */

public class SmithNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is smith number or not
		if(nu.isSmith(num))
			System.out.println("The number " + num + " is a smith number");
		else
			System.out.println("The number " + num + " is not a smith number");
		
		sc.close();
		
	}

}
