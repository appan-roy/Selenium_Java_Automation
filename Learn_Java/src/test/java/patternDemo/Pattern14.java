package patternDemo;

import java.util.Scanner;

/*
. . . . . .
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

public class Pattern14 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=n; i>=1; i--) {
			
			for(j=1; j<=i; j++)
				System.out.printf("%d\t", j);
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
