package patternDemo;

import java.util.Scanner;

/*
5	4	3	2	1	
	5	4	3	2	
		5	4	3	
			5	4	
				5	
			5	4	
		5	4	3	
	5	4	3	2	
5	4	3	2	1	
*/

public class Pattern51 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			for(j=i;j>1;j--)
				System.out.printf("\t");
			
			for(k=n;k>=i;k--)
				System.out.printf("%d\t", k);
				
			System.out.println();
			
		}
		
		for(x=n-1;x>=1;x--) {
			
			for(y=x;y>1;y--)
				System.out.printf("\t");
			
			for(z=n;z>=x;z--)
				System.out.printf("%d\t", z);
			
			System.out.println();
			
		}

		sc.close();

	}

}
