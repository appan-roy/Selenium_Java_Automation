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

public class Pattern32 {

	public static void main(String[] args) {
		
		int i,j,k,m;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=1; j<=i; j++)
				System.out.printf("%d\t", j);
			
			System.out.println();
			
		}
		
		for(k=(n-1); k>=1; k--) {
			
			for(m=1; m<=k; m++)
				System.out.printf("%d\t", m);
			
			System.out.println();
			
		}

		sc.close();

	}

}
