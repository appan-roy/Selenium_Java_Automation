package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A cyclic number is an integer in which cyclic permutations of the digits are successive multiples of the 
 * number. The most widely known is the six-digit number 142857.
 * 	142857 × 1 = 142857
    142857 × 2 = 285714
    142857 × 3 = 428571
    142857 × 4 = 571428
    142857 × 5 = 714285
    142857 × 6 = 857142 
 */

public class CyclicNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int digits = nu.numOfDigits(num);
		
		int counter = 0;
		
		// check the number is cyclic number or not
		for(int i = 1; i <= digits; i++) {
			
			int multiple = num * i;
			
			int temp = num;
			
			for(int j = 1; j <= digits; j++) {
				
				temp = nu.shiftLeft(temp);
				
				if(temp == multiple) {
					counter++;
					break;
				}else
					continue;
				
			}
			
		}

		if(counter == digits)
			System.out.println("The number " + num + " is a cyclic number");
		else
			System.out.println("The number " + num + " is not a cyclic number");
		
		sc.close();
		
	}

}
