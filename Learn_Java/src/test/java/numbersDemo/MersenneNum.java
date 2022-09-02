package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * Mersenne Prime is a prime number that is one less than a power of two. In other words, any prime is 
 * Mersenne Prime if it is of the form 2^k-1 where k is an integer greater than or equal to 2. First few 
 * Mersenne Primes are 3, 7, 31 and 127.
 */

public class MersenneNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int nextNum = num + 1;
		
		int power = 0, flag = 0;
		
		// check the number is mersenne number or not
		for(int i = 0; ; i++) {
			
			power = (int) Math.pow(2, i);
			
			if(power > nextNum)
				break;
			else if(power == nextNum)
				flag = 1;
			
		}

		if(flag == 1) {
			
			if(nu.isPrime(num))
				System.out.println("The number " + num + " is a mersenne prime number");
			else
				System.out.println("The number " + num + " is a mersenne number");
			
		}else
			System.out.println("The number " + num + " is not a mersenne number");
		
		sc.close();
		
	}

}
