package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * To verify an ISBN, calculate 10 times the first digit, plus 9 times the second digit, plus 8 times the 
 * third digit and so on until we add 1 time the last digit. If the final number leaves no remainder when 
 * divided by 11, the code is a valid ISBN. Example: For an ISBN "1259060977".
 * Sum = 1*10 + 2*9 + 5*8 + 9*7 + 0*6 + 6*5 + 0*4 + 9*3 + 7*2 + 7*1 = 209.
 * Now divide it with 11 = 209%11 = 0. If the resultant value will be Zero then it is a valid ISBN.
 * More ex: 1245876589.
 */

public class ISBN {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		long isbn = sc.nextLong();

		// check the ISBN is valid or not
		long sum = 0, temp = isbn;
		
		int pos = 1;
		
		if(nu.numOfDigits(temp) == 10) {
			
			while(nu.numOfDigits(temp) > 0) {
				
				int rem = (int) (temp % 10);
				
				sum += rem * pos;
				
				temp /= 10;
				
				pos++;
				
			}
			
			if(sum % 11 == 0)
				System.out.println("The ISBN " + isbn + " is valid");
			else
				System.out.println("The ISBN " + isbn + " is invalid");

		}else
			System.out.println(isbn + " is not an ISBN");
		
		sc.close();
		
	}

}
