package patternDemo;

import java.util.Scanner;

/*
				1	
			1	2	1	
		1	2	3	2	1	
	1	2	3	4	3	2	1	
1	2	3	4	5	4	3	2	1
. . . . . . . . . . . . . . . . . . . . . .
*/

public class Pattern26 {

	public static void main(String[] args) {
		
		int i,j,k,m;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=i; j<=(n-1); j++)
				System.out.printf("\t");
			
			for(k=1; k<=i; k++)
				System.out.printf("%d\t", k);
			
			for(m=(i-1); m>=1; m--)
				System.out.printf("%d\t", m);
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
