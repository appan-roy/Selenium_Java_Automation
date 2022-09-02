package patternDemo;

import java.util.Scanner;

/*
				5	
			5	4	5	
		5	4	3	4	5	
	5	4	3	2	3	4	5	
5	4	3	2	1	2	3	4	5	
. . . . . . . . . . . . . . . . . . . . . .
*/

public class Pattern27 {

	public static void main(String[] args) {
		
		int i,j,k,m;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=n; i>=1; i--) {
			
			for(j=i; j>1; j--)
				System.out.printf("\t");
			
			for(k=n; k>=i; k--)
				System.out.printf("%d\t", k);
			
			for(m=(i+1); m<=n; m++)
				System.out.printf("%d\t", m);
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
