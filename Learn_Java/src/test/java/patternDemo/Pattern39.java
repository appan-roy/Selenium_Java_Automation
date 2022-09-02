package patternDemo;

import java.util.Scanner;

/*
1								1	
2	1						1	2	
3	2	1				1	2	3	
4	3	2	1		1	2	3	4	
5	4	3	2	1	2	3	4	5	
*/

public class Pattern39 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z,m = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		m = 2*(n-1) - 1;
		
		for(x=1; x<=n; x++) {
			
			if(x != n) {
				
				for(i=x;i>=1;i--)
					System.out.printf("%d\t", i);
				
				for(j=1;j<=m;j++)
					System.out.printf("\t");
				
				for(k=1;k<=x;k++)
					System.out.printf("%d\t", k);
				
				m-=2;
				
			}else {
				
				for(y=x;y>=1;y--)
					System.out.printf("%d\t", y);
				
				for(z=2;z<=x;z++)
					System.out.printf("%d\t", z);
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
