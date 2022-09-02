package patternDemo;

import java.util.Scanner;

/*
1
3 2
5 4 3
7 6 5 4
9 8 7 6 5
. . . . . . . . . .
*/

public class Pattern10 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=(2*n-1); i+=2) {
			
			for(j=i; j>=((i+1)/2); j--)
				System.out.printf("%d\t", j);
			System.out.println();
			
		}
		
		sc.close();

	}

}
