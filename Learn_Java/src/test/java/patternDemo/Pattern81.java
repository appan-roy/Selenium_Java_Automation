package patternDemo;

import java.util.Scanner;

/*
Enter your name : 
APPAN
A	
A	P	
A	P	P	
A	P	P	A	
A	P	P	A	N	
*/

public class Pattern81 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		
		char arrName [] = sc.next().toCharArray();
		
		for(i=0; i <= arrName.length-1; i++) {
			
			for(j=0;j<=i;j++)
				System.out.printf("%c\t", arrName[j]);
			
			System.out.println();
			
		}
			
		sc.close();

	}

}
