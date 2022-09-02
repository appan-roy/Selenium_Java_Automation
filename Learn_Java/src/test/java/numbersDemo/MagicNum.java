package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * Magic number is the if the sum of its digits recursively are calculated till a single digit If the single 
 * digit is 1 then the number is a magic number. Example: 199 is a magic number as 1+9+9=19 but 19 is not a 
 * single digit number so 1+9=10 and then 1+0=1 which is a single digit number and also 1. More ex: 19, 28, 
 * 37, 46, 55, 64, 73, 82, 91, 100, 226.
 */

public class MagicNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int temp = num;
		
		// check the number is magic number or not
		while(nu.numOfDigits(temp) > 1) {
			
			temp = nu.sumOfDigits(temp);
			
		}

		if(temp == 1)
			System.out.println("The number " + num + " is a magic number");
		else
			System.out.println("The number " + num + " is not a magic number");
		
		sc.close();
		
	}

}
