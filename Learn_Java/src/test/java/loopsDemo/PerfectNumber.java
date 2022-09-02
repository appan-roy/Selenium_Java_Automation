package loopsDemo;

import java.util.Scanner;

/*
Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
Factors of 6=1,2,3 & also 6=1+2+3. So 6 is a perfect no.
*/

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int number = sc.nextInt();
		
		int s = 0;
		
		for(int i=1; i<number; i++) {
			
			if(number%i == 0) {
				s+=i;
			}
			
		}
		
		if(s==number) {
			System.out.printf("The number %d is perfect", number);
		}else {
			System.out.printf("The number %d is not perfect", number);
		}

		sc.close();

	}

}
