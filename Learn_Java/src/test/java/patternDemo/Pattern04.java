package patternDemo;

import java.util.Scanner;

/*
5
4 4
3 3 3
2 2 2 2
1 1 1 1 1
. . . . . .
*/

public class Pattern04 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=n; i>=1; i--) {
			
			for(j=i; j<=n; j++)
				System.out.printf("%d\t", i);
			System.out.println();
			
		}
		
		sc.close();

	}

}
