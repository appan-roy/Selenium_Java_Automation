package seriesDemo;

import java.util.Scanner;

/*
 * The harmonic series is as follows:
 * H1 = 1
 * H2 = H1 + 1/2
 * H3 = H2 + 1/3
 * H4 = H3 + 1/4
 * ...
 * Hn = Hn-1 + 1/n
 * 
 * S = (1) + (1 + 1/2) + (1 + 1/2 + 1/3) + (1 + 1/2 + 1/3 + 1/4) +………upto n terms
 */

public class HarmonicNumberSeries {

	public static void main(String[] args) {
		
		float s = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		
		for(int i = 1; i <= n; i++) {
			
			System.out.print("(");
			
			for(int j = 1; j <= i; j++) {
				
				if(j != i) {
					
					System.out.print("1/"+j+" + ");
					
				} else {
					
					System.out.print("1/"+j+"), ");
					
				}
				
				s += (float) (1 / (float) j);
				
			}

		}
		
		System.out.println("\nThe sum of the series upto "+n+" terms is : "+s);
		
		sc.close();

	}

}
