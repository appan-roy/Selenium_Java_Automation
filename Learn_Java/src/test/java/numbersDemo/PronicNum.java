package numbersDemo;

import java.util.Scanner;

/*
 * A pronic number is a number which is the product of two consecutive integers, that is, a number of the 
 * form n(n + 1). The first few pronic numbers are: 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 
 * 210, 240, 272, 306, 342, 380, 420, 462 … etc.
 */

public class PronicNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is pronic number or not
		int sqrt = (int) Math.sqrt(num);
		
		if(sqrt * (sqrt+1) == num)
			System.out.println("The number " + num + " is a pronic number");
		else
			System.out.println("The number " + num + " is not a pronic number");
		
		sc.close();
		
	}

}
