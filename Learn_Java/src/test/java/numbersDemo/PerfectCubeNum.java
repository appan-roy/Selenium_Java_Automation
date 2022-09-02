package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

public class PerfectCubeNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		// check the number is perfect cube or not
		if(nu.isPerfectCube(num))
			System.out.println("The number " + num + " is a perfect cube");
		else
			System.out.println("The number " + num + " is not a perfect cube");
		
		sc.close();
		
	}

}
