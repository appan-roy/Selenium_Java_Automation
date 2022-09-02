package patternDemo;

import java.util.Scanner;

/*
1	2	3	4	5	6	7	8	9	
	1	2	3	4	5	6	7	
		1	2	3	4	5	
			1	2	3	
				1	
*/

public class Pattern30 {

	public static void main(String[] args) {
		
		int i,j,k;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=1; j<i; j++)
				System.out.printf("\t");
			
			for(k=1; k<=(2*n-1)-((i-1)*2); k++)
				System.out.printf("%d\t", k);
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
