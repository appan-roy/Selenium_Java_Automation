package patternDemo;

import java.util.Scanner;

/*
1	1	1	1	1	1	1	1	1	
2	2	2	2		2	2	2	2	
3	3	3				3	3	3	
4	4						4	4	
5								5	
*/

public class Pattern41 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,m = 1;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(x=1; x<=n; x++) {
			
			if(x == 1) {
				
				for(y=x;y<=(2*n-1);y++)
					System.out.printf("%d\t", x);
				
			}else {
				
				for(i=x;i<=n;i++)
					System.out.printf("%d\t", x);
				
				for(j=m;j>=1;j--)
					System.out.printf("\t");
					
				for(k=x;k<=n;k++)
					System.out.printf("%d\t", x);
				
				m+=2;
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
