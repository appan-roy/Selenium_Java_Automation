package patternDemo;

import java.util.Scanner;

/*
1 2 3 4
2 3 4
3 4
4
3 4
2 3 4
1 2 3 4
*/

public class Pattern46 {

	public static void main(String[] args) {
		
		int i,j,x,y;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			for(j=i;j<=n;j++)
				System.out.printf("%d\t", j);
			
			System.out.println();
			
		}
		
		for(x=n-1;x>=1;x--) {
			
			for(y=x;y<=n;y++)
				System.out.printf("%d\t", y);
			
			System.out.println();
			
		}

		sc.close();

	}

}
