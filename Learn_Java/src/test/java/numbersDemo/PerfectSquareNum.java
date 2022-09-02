package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

public class PerfectSquareNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is perfect square or not
		if(nu.isPerfectSquare(num))
			System.out.println("The number " + num + " is a perfect square");
		else
			System.out.println("The number " + num + " is not a perfect square");
		
		sc.close();
		
	}

}
