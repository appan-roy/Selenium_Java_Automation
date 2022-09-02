package patternDemo;

import java.util.Scanner;

/*
2	
4	2	
8	4	2	
16	8	4	2	
32	16	8	4	2
. . . . . .
*/

public class Pattern08 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=2; i<=(Math.pow(2, n)); i*=2) {
			
			for(j=i; j>=2; j/=2)
				System.out.printf("%d\t", j);
			System.out.println();
			
		}
		
		sc.close();

	}

}
