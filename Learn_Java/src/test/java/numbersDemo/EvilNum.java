package numbersDemo;

import java.util.Scanner;

import utility.ConverterUtils;
import utility.NumberUtils;

/*
 * An Evil number is a positive whole number that has an even number of 1's in its binary equivalent. Example: The binary equivalent of 9 is 1001, and 1001 contains even 
 * numbers of 1's so 9 is an evil number. 4) If the number of 1's is even then it is an evil number else the given number is not an evil number.
 */

public class EvilNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		ConverterUtils cu = new ConverterUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is evil number or not
		long binaryNum = cu.decimalToBinary(num);
		
		int countOfOne = nu.numOfOccurenceOfDigit(binaryNum, 1);

		if(countOfOne % 2 == 0)
			System.out.println("The number " + num + " is an evil number");
		else
			System.out.println("The number " + num + " is not an evil number");
		
		sc.close();
		
	}

}
