package patternDemo;

import java.util.Scanner;

/*
Enter your name : 
APPAN
				A
			P
		P
	A
N			
*/

public class Pattern78 {

	public static void main(String[] args) {
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		
		char arrName [] = sc.next().toCharArray();
		
		for(i=0; i < arrName.length; i++) {
			
			for(j=i;j<arrName.length-1;j++)
				System.out.printf("\t");
			
			System.out.printf("%c\n", arrName[i]);
			
		}
			
		sc.close();

	}

}
