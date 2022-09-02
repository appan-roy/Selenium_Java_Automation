package patternDemo;

import java.util.Scanner;

/*
4 3 2 1
3 2 1
2 1
1
2 1
3 2 1
4 3 2 1
*/

public class Pattern47 {

	public static void main(String[] args) {
		
		int i,j,x,y;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=n;i>=1;i--) {
			
			for(j=i;j>=1;j--)
				System.out.printf("%d\t", j);
			
			System.out.println();
			
		}
		
		for(x=2;x<=n;x++) {
			
			for(y=x;y>=1;y--)
				System.out.printf("%d\t", y);
			
			System.out.println();
			
		}

		sc.close();

	}

}
