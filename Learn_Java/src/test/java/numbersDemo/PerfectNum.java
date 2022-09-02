package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is 
 * equal to that number. Factors of 6=1,2,3 & also 6=1+2+3. Another ex: 1 + 2 + 4 + 7 + 14 = 28.
 */

public class PerfectNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is perfect or not
		if((nu.sumOfAllFactors(num)-num) == num)
			System.out.println("The number " + num + " is a perfect number");
		else
			System.out.println("The number " + num + " is not a perfect number");
		
		sc.close();
		
	}

}
