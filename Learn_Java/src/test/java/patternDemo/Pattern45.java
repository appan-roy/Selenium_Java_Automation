package patternDemo;

import java.util.Scanner;

/*
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
*/

public class Pattern45 {

	public static void main(String[] args) {
		
		int i,j,x,y;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=n;i>=1;i--) {
			
			for(j=1;j<=i;j++)
				System.out.printf("%d\t", j);
			
			System.out.println();
			
		}
		
		for(x=2;x<=n;x++) {
			
			for(y=1;y<=x;y++)
				System.out.printf("%d\t", y);
			
			System.out.println();
			
		}

		sc.close();

	}

}
