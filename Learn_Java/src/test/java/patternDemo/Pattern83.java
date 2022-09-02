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

public class Pattern83 {

	public static void main(String[] args) {
		
		int i,j,k;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		
		char arrName [] = sc.next().toCharArray();
		
		for(i=0; i < arrName.length; i++) {
			
			for(j=i+1;j<arrName.length;j++)
				System.out.printf("\t");
			
			for(k=0;k<=i;k++)
				System.out.printf("%c\t", arrName[k]);
			
			System.out.println();
			
		}
			
		sc.close();

	}

}
