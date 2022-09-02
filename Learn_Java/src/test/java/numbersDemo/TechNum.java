package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A tech number can be tech number if its digits are even and the number of digits split into two number 
 * from middle then add these number if the added number’s square would be the same with the number it will 
 * called a Tech Number. Note: If number of digits is not even then it is not a tech number. Example- 2025
 * 1.	Number of digits must be even
 * 2.	Divide number from middle i.e., 20 & 25
 * 3.	20 + 25 = 45
 * 4.	45^2 = 2025 = original number. More ex: 3025.
 */

public class TechNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int digits = nu.numOfDigits(num);
		
		// check the number is tech number or not
		if(nu.isEven(digits)) {
			
			int rem = (int) (num % Math.pow(10, digits/2));
			
			int quotient = (int) (num / Math.pow(10, digits/2));
			
			if(nu.squareOfNum(quotient + rem) == num)
				System.out.println("The number " + num + " is a tech number");
			else
				System.out.println("The number " + num + " is not a tech number");
			
		}else
			System.out.println("The number " + num + " is not a tech number");

		sc.close();
		
	}

}
