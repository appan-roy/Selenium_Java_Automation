package patternDemo;

import java.util.Scanner;

/*
				1	
			2	3	2	
		3	4	5	4	3	
	4	5	6	7	6	5	4	
5	6	7	8	9	8	7	6	5	
		3	4	5	4	3	
			2	3	2	
				1	
*/

public class Pattern58 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z,l,w;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1;i<=(2*n-1);i+=2) {
			
			for(j=1;j<=(2*n-1-i)/2;j++)
				System.out.printf("\t");
			
			for(k=(i+1)/2;k<=i;k++)
				System.out.printf("%d\t", k);
			
			for(l=i-1;l>=(i+1)/2;l--)
				System.out.printf("%d\t", l);
				
			System.out.println();
			
		}
		
		for(x=5;x>0;x-=2) {
			
			for(y=1;y<=(2*n-1-x)/2;y++)
				System.out.printf("\t");
			
			for(z=(x+1)/2;z<=x;z++)
				System.out.printf("%d\t", z);
			
			for(w=x-1;w>=(x+1)/2;w--)
				System.out.printf("%d\t", w);
			
			System.out.println();
			
		}

		sc.close();

	}

}
