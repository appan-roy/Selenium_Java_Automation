package patternDemo;

import java.util.Scanner;

/*
1	2	3	4	5	
	2	3	4	5	
		3	4	5	
			4	5	
				5	
			4	5	
		3	4	5	
	2	3	4	5	
1	2	3	4	5	
*/

public class Pattern50 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			for(j=i;j>1;j--)
				System.out.printf("\t");
			
			for(k=i;k<=n;k++)
				System.out.printf("%d\t", k);
				
			System.out.println();
			
		}
		
		for(x=n-1;x>=1;x--) {
			
			for(y=x;y>1;y--)
				System.out.printf("\t");
			
			for(z=x;z<=n;z++)
				System.out.printf("%d\t", z);
			
			System.out.println();
			
		}

		sc.close();

	}

}
