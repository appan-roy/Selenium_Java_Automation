package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A Goldbach number is a positive even integer that can be expressed as the sum of two odd primes. 
 * Note: All even integer numbers greater than 4 are Goldbach numbers. Hence, 6 has one odd prime 
 * pair 3 and 3. Similarly, 10 has two odd prime pairs, i.e. 3, 7 and 5, 5.
 */

public class GoldbachNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int flag = 0;
		
		// check the number is goldbach number or not
		if(nu.isEven(num)) {
			
			int half = num / 2;
			
			for(int i = 2, j = (num-2); i <= half && j >= half; i++, j--) {
				
				if((! nu.isEven(i)) && (! nu.isEven(j))){
					
					if(nu.isPrime(i) && nu.isPrime(j))
						flag = 1;
					
				}
				
			}
			
		}

		if(flag == 1)
			System.out.println("The number " + num + " is a goldbach number");
		else
			System.out.println("The number " + num + " is not a goldbach number");
		
		sc.close();
		
	}

}
