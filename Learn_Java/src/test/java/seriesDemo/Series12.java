package seriesDemo;

import java.util.Scanner;

//S = (1+2)/(1*2) + (1+2+3)/(1*2*3) + (1+2+3+4)/(1*2*3*4) + ………upto n terms

public class Series12 {

	public static void main(String[] args) {

		double s = 0, d = 1;
		int c = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();

		System.out.println("The series is : ");
		for (int i = 2; i <= (n+1); i++) {

			System.out.print("(");
			
			int j=1;
			
			while(j <= i) {
				if(j != i)
					System.out.print(j+"+");
				else
					System.out.print(j+")");
				j++;
			}
			
			System.out.print("/(");
			
			int k=1;
			
			while(k <= i) {
				if(k != i)
					System.out.print(k+"*");
				else
					System.out.print(k+"), ");
				k++;
			}

			c+=i;
			d*=i;
			s+=(c/d);

		}

		System.out.println("\nThe sum of the series upto " + n + " terms is : " + s);

		sc.close();

	}

}
