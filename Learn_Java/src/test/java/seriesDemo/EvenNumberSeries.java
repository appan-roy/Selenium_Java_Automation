package seriesDemo;

import java.util.Scanner;

//S=2+4+6+…..+2n

public class EvenNumberSeries {

	public static void main(String[] args) {
		
		int s=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		for(int i=2; i <= (2*n); i+=2) {
			s+=i;
			System.out.print(i+", ");
		}
		
		System.out.println("\nThe sum of the series upto "+n+" terms is : "+s);
		
		sc.close();

	}

}
