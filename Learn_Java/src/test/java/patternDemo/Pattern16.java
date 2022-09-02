package patternDemo;

import java.util.Scanner;

/*
. . . . . .
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/

public class Pattern16 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=n; j>=i; j--)
				System.out.printf("%d\t", j);
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
