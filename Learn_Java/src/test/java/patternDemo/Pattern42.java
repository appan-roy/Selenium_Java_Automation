package patternDemo;

import java.util.Scanner;

/*
1	2	3	4	5	4	3	2	1	
1	2	3	4		4	3	2	1	
1	2	3				3	2	1	
1	2						2	1	
1								1
*/

public class Pattern42 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z,m = 1;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(x=n; x>=1; x--) {
			
			if(x == n) {
				
				for(y=1;y<=x;y++)
					System.out.printf("%d\t", y);
				
				for(z=x-1;z>=1;z--)
					System.out.printf("%d\t", z);
				
			}else {
				
				for(i=1;i<=x;i++)
					System.out.printf("%d\t", i);
				
				for(j=m;j>=1;j--)
					System.out.printf("\t");
					
				for(k=x;k>=1;k--)
					System.out.printf("%d\t", k);
				
				m+=2;
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
