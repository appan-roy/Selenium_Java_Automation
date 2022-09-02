package patternDemo;

import java.util.Scanner;

/*
				1	
			3	2	1	
		5	4	3	2	1	
	7	6	5	4	3	2	1	
9	8	7	6	5	4	3	2	1	
	7	6	5	4	3	2	1	
		5	4	3	2	1	
			3	2	1	
				1	
*/

public class Pattern56 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			for(j=i;j<n;j++)
				System.out.printf("\t");
			
			for(k=(2*i-1);k>0;k--)
				System.out.printf("%d\t", k);
				
			System.out.println();
			
		}
		
		for(x=n-1;x>0;x--) {
			
			for(y=x;y<n;y++)
				System.out.printf("\t");
			
			for(z=(2*x-1);z>0;z--)
				System.out.printf("%d\t", z);
			
			System.out.println();
			
		}

		sc.close();

	}

}
