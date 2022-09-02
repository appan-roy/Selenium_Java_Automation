package seriesDemo;

import java.util.Scanner;

//S = (1) + (2/3) + (3/6) + (4/10) + (5/15) + ………upto n terms

public class Series08 {

	public static void main(String[] args) {

		float s=0;
		int x=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		for(int i=1; i<=n; i++) {
			
			System.out.print("("+i);

			x+=i;
			
			System.out.print("/"+x+"), ");
			
			s+=i/(float)x;
			
		}
		
		System.out.println("\nThe sum of the series upto "+n+" terms is : "+s);
		
		sc.close();

	}

}
