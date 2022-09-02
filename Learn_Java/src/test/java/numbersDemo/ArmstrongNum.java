package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 
 * 0, 1, 153, 370, 371, 407 etc. 153 is an Armstrong no. because 1^3+5^3+3^3=153. More example:- 370,371,407.
 */

public class ArmstrongNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is an armstrong number or not
		if(nu.sumOfCubeOfDigits(num) == num)
			System.out.println("The number " + num + " is an armstrong number");
		else
			System.out.println("The number " + num + " is not an armstrong number");
		
		sc.close();
		
	}

}
