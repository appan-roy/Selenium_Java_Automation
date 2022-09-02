package seriesDemo;

import java.util.Scanner;

//S = (1^10) + (2^9) + (3^8) + ..... + (8^3) + (9^2) + (10^1)

public class Series20 {

	public static void main(String[] args) {

		long s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();

		System.out.println("The series is : ");
		for(int i=1; i<=n; i++) {
			
			System.out.print("("+i+"^"+(11-i)+"), ");
			
			s+=Math.pow(i, (11-i));
			
		}

		System.out.println("\nThe sum of the series upto " + n + " terms is : " + s);

		sc.close();

	}

}
