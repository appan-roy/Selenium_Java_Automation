package seriesDemo;

import java.util.Scanner;

//2, 5, 10, 17, 26, 37, 50, 65, 82, 101

public class Series03 {

	public static void main(String[] args) {

		long j=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		for(int i=1; i<=n; i++) {
			j = (long) (Math.pow(i, 2)+1);
			System.out.print(j+", ");
		}
		
		sc.close();

	}

}
