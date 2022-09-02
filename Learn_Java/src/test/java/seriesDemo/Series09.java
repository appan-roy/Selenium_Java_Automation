package seriesDemo;

import java.util.Scanner;

//S = (1) - (1/2) + (1/3) - (1/4) + (1/5) - (1/6) + ………upto n terms

public class Series09 {

	public static void main(String[] args) {

		float s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();

		System.out.println("The series is : ");
		for (int i = 1; i <= n; i++) {

			System.out.print("(1/"+i+"), ");

			if (i % 2 == 0)
				s -= (float) 1 / i;
			else
				s += (float) 1 / i;

		}

		System.out.println("\nThe sum of the series upto " + n + " terms is : " + s);

		sc.close();

	}

}
