package numbersDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import utility.NumberUtils;

/*
 * A n digit number x is called Keith number if it appears in a special sequence (defined below) generated 
 * using its digits. The special sequence has first n terms as digits of x and other terms are recursively 
 * evaluated as sum of previous n terms. Input : x = 197, Output : Yes
 * 197 has 3 digits, so n = 3. The number is Keith because it appears in the special sequence that has first 
 * three terms as 1, 9, 7 and remaining terms evaluated using sum of previous 3 terms.
 * 1, 9, 7, 17, 33, 57, 107, 197, .....
 * More ex: 14 comes in 1, 4, 5, 9, 14, ...
 */

public class KeithNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int temp = num, digits = nu.numOfDigits(num);
		
		// check the number is keith number or not
		while(temp > 0) {
			
			list.add(temp % 10);
			
			temp /= 10;

		}
		
		// To get digits in right order (from MSB to LSB)
		Collections.reverse(list);
		
		/* Keep finding next trms of a sequence generated using digits of x until we either reach x or a 
		 * number greate than x */
		int next = 0;
		
		while(next < num) {
			
			next = 0;
			
			// Next term is sum of previous n terms 
	        for (int i = 1; i <= digits; i++) 
	            next += list.get(list.size() - i); 
	  
	        list.add(next);
			
		}
		
		/* When the control comes out of the while loop, either the next_term is equal to the number 
		 * or greater than it. If next_term is equal to x, then x is a Keith number, else not */
		if(next == num)
			System.out.println("The number " + num + " is a keith number");
		else
			System.out.println("The number " + num + " is not a keith number");
		
		sc.close();
		
	}

}
