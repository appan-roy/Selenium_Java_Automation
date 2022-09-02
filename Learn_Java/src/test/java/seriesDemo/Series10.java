package seriesDemo;

import java.util.Scanner;

//S = (1/2) - (2/3) + (3/4) - (4/5) + (5/6) - (6/7) + ………upto n terms

public class Series10 {

	public static void main(String[] args) {

		float s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();

		System.out.println("The series is : ");
		for (int i = 1; i <= n; i++) {

			System.out.print("("+i+"/"+(i+1)+"), ");

			if (i % 2 == 0)
				s -= (float) i / (i+1);
			else
				s += (float) i / (i+1);

		}

		System.out.println("\nThe sum of the series upto " + n + " terms is : " + s);

		sc.close();

	}

}
