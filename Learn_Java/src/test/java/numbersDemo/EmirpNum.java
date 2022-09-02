package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * An emirp number is a number which is prime backwards and forwards. Example : 13 and 31 are both prime numbers.
 * Thus 13 is a emirp number. More ex: 37, 17, 11.
 */

public class EmirpNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int revNum = nu.reverseNumber(num);
		
		// check the number is emirp number or not
		if(nu.isPrime(num) && nu.isPrime(revNum))
			System.out.println("The number " + num + " is an emirp number");
		else
			System.out.println("The number " + num + " is not an emirp number");
		
		sc.close();
		
	}

}
