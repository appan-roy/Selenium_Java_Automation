package seriesDemo;

import java.util.Scanner;

//S=1+3+5+…….+(2n-1)

public class OddNumberSeries {

	public static void main(String[] args) {
		
		int s=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		for(int i=1; i <= (2*n-1); i+=2) {
			s+=i;
			System.out.print(i+", ");
		}
		
		System.out.println("\nThe sum of the series upto "+n+" terms is : "+s);
		
		sc.close();

	}

}
