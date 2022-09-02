package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A Kaprekar number is a number whose square when divided into two parts and such that sum of parts is equal 
 * to the original number and none of the parts has value 0. Explanation : 45^2 = 2025 and 20 + 25 is 45, 
 * Explanation:  297^2 = 88209 and 88 + 209 is 297 etc. More ex: 1 9 45 55 99 297 703 999 2223 2728 4879 
 * 4950 5050 5292 7272 7777 9999
 */

public class KaprekarNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is kaprekar number or not
		int sq = nu.squareOfNum(num);
		int digits = nu.numOfDigits(sq);
		int flag = 0;
		
		for(int i = 1; i < digits; i++) {
			
			int rem = (int) (sq % Math.pow(10, i));
			
			int quotient = (int) (sq / Math.pow(10, i));
			
			if((quotient + rem) == num) {
				flag = 1;
				break;
			}else
				continue;
			
		}

		if(flag == 1)
			System.out.println("The number " + num + " is a kaprekar number");
		else
			System.out.println("The number " + num + " is not a kaprekar number");
		
		sc.close();
		
	}

}
