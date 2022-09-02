package patternDemo;

import java.util.Scanner;

/*
Enter your name : 
APPAN
A	P	P	A	N	
A	P	P	A	
A	P	P	
A	P	
A
*/

public class Pattern82 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		
		char arrName [] = sc.next().toCharArray();
		
		for(i=arrName.length-1; i >= 0; i--) {
			
			for(j=0;j<=i;j++)
				System.out.printf("%c\t", arrName[j]);
			
			System.out.println();
			
		}
			
		sc.close();

	}

}
