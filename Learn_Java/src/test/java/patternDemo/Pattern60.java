package patternDemo;

import java.util.Scanner;

/*
1								1	
1	2						2	1	
1	2	3				3	2	1	
1	2	3	4		4	3	2	1	
1	2	3	4	5	4	3	2	1	
1	2	3	4		4	3	2	1	
1	2	3				3	2	1	
1	2						2	1	
1								1	
*/

public class Pattern60 {

	public static void main(String[] args) {
		
		int i,j,k,l,m,x,y,z,w,p=0,q=1,r;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		p = (2*(n-1)-1);
		
		for(i=1;i<=n;i++) {
			
			if(i != n) {
				
				for(j=1;j<=i;j++)
					System.out.printf("%d\t", j);
				
				for(k=1;k<=p;k++)
					System.out.printf("\t");
				
				for(l=i;l>0;l--)
					System.out.printf("%d\t", l);
				
				p-=2;
				
			}else {
				
				for(m=1;m<=i;m++)
					System.out.printf("%d\t", m);
				
				for(r=i-1;r>0;r--)
					System.out.printf("%d\t", r);

			}
	
			System.out.println();
			
		}
		
		for(x=n-1;x>0;x--) {
			
			for(y=1;y<=x;y++)
				System.out.printf("%d\t", y);
			
			for(z=q;z>0;z--)
				System.out.printf("\t");
			
			for(w=x;w>0;w--)
				System.out.printf("%d\t", w);
			
			q+=2;
			
			System.out.println();
			
		}

		sc.close();

	}

}
