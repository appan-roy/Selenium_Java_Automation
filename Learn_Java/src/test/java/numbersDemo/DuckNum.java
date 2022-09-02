package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A number is called as Duck number if zeroes are present in it but there should be no zero present at the 
 * beginning of the number. E.g., 3100, 7430689 etc.
 */

public class DuckNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is duck number or not
		if(nu.isDuck(num))
			System.out.println("The number " + num + " is a duck number");
		else
			System.out.println("The number " + num + " is not a duck number");
		
		sc.close();
		
	}

}
