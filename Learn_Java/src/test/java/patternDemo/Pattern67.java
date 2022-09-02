package patternDemo;

import java.util.Scanner;

/*
				1		
			2		3		
		4		5		6		
	7		8		9		10		
11		12		13		14		15
*/

public class Pattern67 {

	public static void main(String[] args) {
		
		int x,y,z,p=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of lines you want to print : ");
		
		int n = sc.nextInt();
		
		for(x=1;x<=n;x++) {
			
			for(y=n;y>x;y--)
				System.out.printf("\t");
			
			for(z=1;z<=x;z++)
				System.out.printf("%d\t\t", ++p);
			
			System.out.println();
			
		}

		sc.close();

	}

}
