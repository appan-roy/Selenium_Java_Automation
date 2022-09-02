package seriesDemo;

import java.util.Scanner;

//S=1+2+3+…….+n

public class NaturalNumberSeries {

	public static void main(String[] args) {
		
		int s=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		for(int i=1; i<=n; i++) {
			s+=i;
			System.out.print(i+", ");
		}
		
		System.out.println("\nThe sum of the series upto "+n+" terms is : "+s);
		
		sc.close();

	}

}
