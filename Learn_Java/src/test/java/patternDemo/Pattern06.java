package patternDemo;

import java.util.Scanner;

/*
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
. . . . . .
*/

public class Pattern06 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=n; i>=1; i--) {
			
			for(j=i; j<=n; j++)
				System.out.printf("%d\t", j);
			System.out.println();
			
		}
		
		sc.close();

	}

}
