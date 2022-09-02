package patternDemo;

import java.util.Scanner;

/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
. . . . . .
*/

public class Pattern01 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=1; j<=i; j++)
				System.out.printf("%d\t", i);
			System.out.println();
			
		}
		
		sc.close();

	}

}
