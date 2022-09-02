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

public class Pattern84 {

	public static void main(String[] args) {
		
		int i,j,k;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		
		char arrName [] = sc.next().toCharArray();
		
		for(i=arrName.length-1; i>=0 ; i--) {
			
			for(j=i+1;j<arrName.length;j++)
				System.out.printf("\t");
			
			for(k=0;k<=i;k++)
				System.out.printf("%c\t", arrName[k]);
			
			System.out.println();
			
		}
			
		sc.close();

	}

}
