package patternDemo;

import java.util.Scanner;

/*
9
7 9
5 7 9
3 5 7 9
1 3 5 7 9
. . . . . .
*/

public class Pattern05 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=(2*n-1); i>=1; i-=2) {
			
			for(j=i; j<=(2*n-1); j+=2)
				System.out.printf("%d\t", j);
			System.out.println();
			
		}
		
		sc.close();

	}

}
