package patternDemo;

import java.util.Scanner;

/*
32	
16	32	
8	16	32	
4	8	16	32	
2	4	8	16	32
. . . . . . . . . .
*/

public class Pattern09 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=(int) (Math.pow(2, n)); i>=2; i/=2) {
			
			for(j=i; j<=(Math.pow(2, n)); j*=2)
				System.out.printf("%d\t", j);
			System.out.println();
			
		}
		
		sc.close();

	}

}
