package patternDemo;

import java.util.Scanner;

/*
				1	
			2	3	2	
		3	4	5	4	3	
	4	5	6	7	6	5	4	
5	6	7	8	9	8	7	6	5
. . . . . . . . . . . . . . . . . . . . . .
*/

public class Pattern28 {

	public static void main(String[] args) {
		
		int i,j,k,m;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=(2*n-1); i+=2) {
			
			for(j=1; j<=((2*n-1-i)/2); j++)
				System.out.printf("\t");
			
			for(k=((i+1)/2); k<=i; k++)
				System.out.printf("%d\t", k);
			
			for(m=(i-1); m>=((i+1)/2); m--)
				System.out.printf("%d\t", m);
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
