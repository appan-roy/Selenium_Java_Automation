package seriesDemo;

import java.util.Scanner;

//S = (1^2) + (2^2) + (3^2) + (4^2) +………upto n terms

public class Series14 {

	public static void main(String[] args) {

		long s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();

		System.out.println("The series is : ");
		for (int i = 1; i <= n; i++) {

			System.out.print("("+i+"^"+"2"+"), ");
			
			s+=Math.pow(i, 2);

		}

		System.out.println("\nThe sum of the series upto " + n + " terms is : " + s);

		sc.close();

	}

}
