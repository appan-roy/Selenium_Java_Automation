package patternDemo;

import java.util.Scanner;

/*
1								1
	2						2
		3				3
			4		4
				5
*/

public class Pattern68 {

	public static void main(String[] args) {
		
		int x,y,z,m=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		m = (2*n-2);
		
		for(x=1;x<=n;x++) {
			
			for(y=1;y<x;y++)
				System.out.printf("\t");
			
			if(x != n) {
				
				System.out.printf("%d", x);
				
				for(z=1;z<=m;z++)
					System.out.printf("\t");
				
				System.out.printf("%d", x);
				
				m-=2;
				
			}else
				System.out.printf("%d", x);
			
			System.out.println();
			
		}

		sc.close();

	}

}
