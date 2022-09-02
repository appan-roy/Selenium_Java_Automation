package numbersDemo;

import java.util.Scanner;

/*
 * The number 111 is called a nelson number and multiples of nelson are called double Nelson (222), triple 
 * Nelson (333), and so on. It is important to note that only few multiples of 111 are called Nelson numbers.
 * These numbers are 111, 222, 333, 444, 555, 666, 777, 888, and 999.
 */

public class NelsonNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is nelson number or not
		if(num % 111 == 0)
			System.out.println("The number " + num + " is a nelson number");
		else
			System.out.println("The number " + num + " is not a nelson number");
		
		sc.close();
		
	}

}
