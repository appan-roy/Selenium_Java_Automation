package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A number is said to be unique , if the digits in it are not repeated. for example, 12345 is a unique 
 * number. 123445 is not a unique number.
 */

public class UniqueNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is unique number or not
		if(nu.isUnique(num))
			System.out.println("The number " + num + " is a unique number");
		else
			System.out.println("The number " + num + " is not a unique number");
		
		sc.close();
		
	}

}
