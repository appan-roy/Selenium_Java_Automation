package patternDemo;

import java.util.Scanner;

/*
				*		
			*		*		
		*		*		*		
	*		*		*		*		
*		*		*		*		*		
. . . . . . . . . . . . . . . . . . . . . .
*/

public class Pattern29 {

	public static void main(String[] args) {
		
		int i,j,k;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=n; j>i; j--)
				System.out.printf("\t");
			
			for(k=1; k<=i; k++)
				System.out.printf("*\t\t");
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
