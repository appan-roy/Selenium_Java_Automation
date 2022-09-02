package seriesDemo;

import java.util.Scanner;

//S = (1) + (x) + (x^2/2) + (x^3/3) + (x^4/4) +………upto n terms

public class Series17 {

	public static void main(String[] args) {

		double s = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();
		
		System.out.println("Enter the value of base x : ");

		int x = sc.nextInt();

		System.out.println("The series is : ");
		System.out.print("(1), ");
		for (int i = 1; i < n; i++) {

			System.out.print("("+x+"^"+i+"/"+i+"), ");
			
			s+=(Math.pow(x, i))/i;

		}

		System.out.println("\nThe sum of the series upto " + n + " terms is : " + s);

		sc.close();

	}

}
