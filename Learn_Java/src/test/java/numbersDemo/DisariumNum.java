package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A Disarium number is a number defined by the following process: Sum of its digits powered with their 
 * respective position is equal to the original number. For example 135 is a Disarium number: 
 * As 1^1+3^2+5^3 = 135. Some other DISARIUM are 89, 175, 518 etc.
 */

public class DisariumNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int sum = 0, temp = num;
		
		while(nu.numOfDigits(temp) > 0) {
			
			int rem = temp % 10;
			
			sum += Math.pow(rem, nu.numOfDigits(temp));
			
			temp /= 10;
			
		}
		
		if(sum == num)
			System.out.println("The number " + num + " is a disarium number");
		else
			System.out.println("The number " + num + " is not a disarium number");
		
		sc.close();
		
	}

}
