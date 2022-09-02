package patternDemo;

import java.util.Scanner;

/*
				1	
			2	1	
		3	2	1	
	4	3	2	1	
5	4	3	2	1	
	4	3	2	1	
		3	2	1	
			2	1	
				1	
*/

public class Pattern35 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=i; j<n; j++)
				System.out.printf("\t");
			
			for(k=i; k>=1; k--)
				System.out.printf("%d\t", k);
			
			System.out.println();
			
		}
		
		for(x=(n-1); x>=1; x--) {
			
			for(y=(n-1); y>=x; y--)
				System.out.printf("\t");
			
			for(z=x; z>=1; z--)
				System.out.printf("%d\t", z);
			
			System.out.println();
			
		}

		sc.close();

	}

}
