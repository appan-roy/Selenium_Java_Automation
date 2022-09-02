package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * If the sum of the factorial of all digits of a number is equal to the original number then the number is 
 * called Krishnamurthy Number. For example- 145 and 40585 are Krishnamurthy numbers. Sometimes the 
 * Krishnamurthy number is also called Strong number, Special number, and Peterson number.
 * 1 and 2 are also Krishnamurthy numbers because their factorials are equal to the same number.
 */

public class KrishnamurthyNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is krishnamurthy number or not
		if(nu.sumOfFactorialOfDigits(num) == num)
			System.out.println("The number " + num + " is a krishnamurthy number");
		else
			System.out.println("The number " + num + " is not a krishnamurthy number");
		
		sc.close();
		
	}

}
