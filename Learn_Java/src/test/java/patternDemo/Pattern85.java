package patternDemo;

import java.util.Scanner;

/*
A	B	C	D	E	D	C	B	A	
A	B	C	D		D	C	B	A	
A	B	C				C	B	A	
A	B						B	A	
A								A
*/

public class Pattern85 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z,m=65;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of letters : ");
		
		int n = sc.nextInt();
		
		for(x=m+(n-1);x>=65;x--) {
			
			if(x == m+(n-1)) {
				
				for(y=65; y<=x; y++)
					System.out.printf("%c\t", y);
				
				for(z=x-1;z>=65;z--)
					System.out.printf("%c\t", z);
				
			}else {
				
				for(i=65;i<=x;i++)
					System.out.printf("%c\t", i);
				
				for(j=m;j>=65;j--)
					System.out.printf("\t");
				
				for(k=x;k>=65;k--)
					System.out.printf("%c\t", k);
				
				m+=2;
				
			}
			
			System.out.println();
			
		}
			
		sc.close();

	}

}
