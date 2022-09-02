package patternDemo;

import java.util.Scanner;

/*
1	2	3	4	5	4	3	2	1	
2	3	4	5		5	4	3	2	
3	4	5				5	4	3	
4	5						5	4	
5								5	
*/

public class Pattern43 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z,m = 1;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(x=1; x<=n; x++) {
			
			if(x == 1) {
				
				for(y=x;y<=n;y++)
					System.out.printf("%d\t", y);
				
				for(z=n-1;z>=x;z--)
					System.out.printf("%d\t", z);
				
			}else {
				
				for(i=x;i<=n;i++)
					System.out.printf("%d\t", i);
				
				for(j=m;j>=1;j--)
					System.out.printf("\t");
					
				for(k=n;k>=x;k--)
					System.out.printf("%d\t", k);
				
				m+=2;
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
