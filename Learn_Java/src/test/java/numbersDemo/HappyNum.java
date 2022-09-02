package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * Happy Number are positive non-zero integer numbers. If we find the sum of the squares of its every digit 
 * and repeat that process until the number will be equals to 1(one). Otherwise, it is called Unhappy Number 
 * or Sad Number. E.g., 19 is Happy Number,
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * As we reached to 1, 19 is a Happy Number. More ex: 10, 100, 82, 68, 91, 28, 86, 23, 32
 */

public class HappyNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int temp = num;
		
		// check the number is happy number or not
		while(nu.numOfDigits(temp) != 1) {
			temp = nu.sumOfSquareOfDigits(temp);
		}
		
		if(temp == 1)
			System.out.println("The number " + num + " is a happy number");
		else
			System.out.println("The number " + num + " is not a happy number");
		
		sc.close();
		
	}

}
