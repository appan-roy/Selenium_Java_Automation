package seriesDemo;

import java.util.Scanner;

//1, 12, 123, 1234, 12345, 123456, 1234567, 12345678,

public class Series02 {

	public static void main(String[] args) {

		long j=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		for(int i=1; i<=n; i++) {
			j = (j*10)+i;
			System.out.print(j+", ");
		}
		
		sc.close();

	}

}
