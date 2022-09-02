package seriesDemo;

import java.util.Scanner;

//S = (1^1) + (2^2) + (3^3) + (4^4) +………upto n terms

public class Series15 {

	public static void main(String[] args) {

		long s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();

		System.out.println("The series is : ");
		for (int i = 1; i <= n; i++) {

			System.out.print("("+i+"^"+i+"), ");
			
			s+=Math.pow(i, i);

		}

		System.out.println("\nThe sum of the series upto " + n + " terms is : " + s);

		sc.close();

	}

}
