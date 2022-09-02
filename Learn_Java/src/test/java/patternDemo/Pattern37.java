package patternDemo;

import java.util.Scanner;

/*
5								5	
4	4						4	4	
3	3	3				3	3	3	
2	2	2	2		2	2	2	2	
1	1	1	1	1	1	1	1	1	
*/

public class Pattern37 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,m = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		m = 2*(n-1) - 1;
		
		for(x=n; x>=1; x--) {
			
			if(x != 1) {
				
				for(i=x;i<=n;i++)
					System.out.printf("%d\t", x);
				
				for(j=1;j<=m;j++)
					System.out.printf("\t");
				
				for(k=x;k<=n;k++)
					System.out.printf("%d\t", x);
				
				m-=2;
				
			}else {
				
				for(y=1;y<=(2*n-1);y++)
					System.out.printf("%d\t", x);
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
