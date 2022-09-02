package patternDemo;

import java.util.Scanner;

/*
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15
. . . . . . . . . .
*/

public class Pattern11 {

	public static void main(String[] args) {
		
		int i,j,p=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=1; j<=i; j++)
				System.out.printf("%d\t", ++p);
			System.out.println();
			
		}
		
		sc.close();

	}

}
