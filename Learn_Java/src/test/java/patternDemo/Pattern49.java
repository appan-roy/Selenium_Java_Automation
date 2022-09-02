package patternDemo;

import java.util.Scanner;

/*
1	2	3	4	5	
	1	2	3	4	
		1	2	3	
			1	2	
				1	
			1	2	
		1	2	3	
	1	2	3	4	
1	2	3	4	5
*/

public class Pattern49 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=n;i>=1;i--) {
			
			for(j=i;j<n;j++)
				System.out.printf("\t");
			
			for(k=1;k<=i;k++)
				System.out.printf("%d\t", k);
				
			System.out.println();
			
		}
		
		for(x=2;x<=n;x++) {
			
			for(y=x;y<n;y++)
				System.out.printf("\t");
			
			for(z=1;z<=x;z++)
				System.out.printf("%d\t", z);
			
			System.out.println();
			
		}

		sc.close();

	}

}
