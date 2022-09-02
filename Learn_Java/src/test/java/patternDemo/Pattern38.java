package patternDemo;

import java.util.Scanner;

/*
1								1	
1	2						2	1	
1	2	3				3	2	1	
1	2	3	4		4	3	2	1	
1	2	3	4	5	4	3	2	1	
*/

public class Pattern38 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z,m = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		m = 2*(n-1) - 1;
		
		for(x=1; x<=n; x++) {
			
			if(x != n) {
				
				for(i=1;i<=x;i++)
					System.out.printf("%d\t", i);
				
				for(j=1;j<=m;j++)
					System.out.printf("\t");
				
				for(k=x;k>=1;k--)
					System.out.printf("%d\t", k);
				
				m-=2;
				
			}else {
				
				for(y=1;y<=x;y++)
					System.out.printf("%d\t", y);
				
				for(z=x-1;z>=1;z--)
					System.out.printf("%d\t", z);
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
