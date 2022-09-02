package patternDemo;

import java.util.Scanner;

/*
				1	
			1	2	
		1	2	3	
	1	2	3	4	
1	2	3	4	5	
	1	2	3	4	
		1	2	3	
			1	2	
				1	
*/

public class Pattern34 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=i; j<n; j++)
				System.out.printf("\t");
			
			for(k=1; k<=i; k++)
				System.out.printf("%d\t", k);
			
			System.out.println();
			
		}
		
		for(x=(n-1); x>=1; x--) {
			
			for(y=x; y<n; y++)
				System.out.printf("\t");
			
			for(z=1; z<=x; z++)
				System.out.printf("%d\t", z);
			
			System.out.println();
			
		}

		sc.close();

	}

}
