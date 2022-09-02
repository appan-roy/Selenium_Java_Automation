package patternDemo;

import java.util.Scanner;

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
. . . . . .
*/

public class Pattern03 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=i; j>=1; j--)
				System.out.printf("%d\t", j);
			System.out.println();
			
		}
		
		sc.close();

	}

}
