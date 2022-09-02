package patternDemo;

import java.util.Scanner;

/*
. . . . . .
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
*/

public class Pattern17 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=i; j<=n; j++)
				System.out.printf("%d\t", j);
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
