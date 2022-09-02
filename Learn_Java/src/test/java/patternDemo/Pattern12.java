package patternDemo;

import java.util.Scanner;

/*
Fibonacci Series
1
1 1
1 1 2
1 1 2 3
1 1 2 3 5
. . . . . .
*/

public class Pattern12 {

	public static void main(String[] args) {
		
		int i,j,a,b,c;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			a=1;
			b=0;
			c=0;
			
			for(j=1; j<=i; j++) {
				c=a+b;
				System.out.printf("%d\t", c);
				a=b;
				b=c;
			}
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
