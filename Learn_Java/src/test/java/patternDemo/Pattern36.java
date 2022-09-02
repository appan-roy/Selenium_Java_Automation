package patternDemo;

import java.util.Scanner;

/*
1								1	
2	2						2	2	
3	3	3				3	3	3	
4	4	4	4		4	4	4	4	
5	5	5	5	5	5	5	5	5	
*/

public class Pattern36 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,m = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		m = 2*(n-1) - 1;
		
		for(x=1; x<=n; x++) {
			
			if(x != n) {
				
				for(i=1;i<=x;i++)
					System.out.printf("%d\t", x);
				
				for(j=1;j<=m;j++)
					System.out.printf("\t");
				
				for(k=1;k<=x;k++)
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
