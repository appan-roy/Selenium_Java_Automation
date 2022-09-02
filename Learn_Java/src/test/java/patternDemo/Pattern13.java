package patternDemo;

import java.util.Scanner;

/*
. . . . . .
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/

public class Pattern13 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=n; i>=1; i--) {
			
			for(j=1; j<=i; j++)
				System.out.printf("%d\t", i);
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
