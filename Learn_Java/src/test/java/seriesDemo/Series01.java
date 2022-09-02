package seriesDemo;

import java.util.Scanner;

//1, 11, 111, 1111, 11111, 111111, 1111111, 11111111, 111111111, 1111111111,

public class Series01 {

	public static void main(String[] args) {

		long s=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		for(int i=0; i<n; i++) {
			s+=Math.pow(10, i);
			System.out.print(s+", ");
		}
		
		sc.close();

	}

}
