package patternDemo;

import java.util.Scanner;

/*
1	2	3	4	5	4	3	2	1	
1	2	3	4		4	3	2	1	
1	2	3				3	2	1	
1	2						2	1	
1								1	
1	2						2	1	
1	2	3				3	2	1	
1	2	3	4		4	3	2	1	
1	2	3	4	5	4	3	2	1	
*/

public class Pattern64 {

	public static void main(String[] args) {
		
		int x,y,z,i,j,k,a,b,c,p,q,r,s=1,t;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		t = 2*n-5;
		
		for(x=n;x>0;x--) {
			
			if(x == n) {
				
				for(y=1;y<=x;y++)
					System.out.printf("%d\t", y);
				
				for(z=x-1;z>0;z--)
					System.out.printf("%d\t", z);
				
			}else {
				
				for(i=1;i<=x;i++)
					System.out.printf("%d\t", i);
					
				for(j=s;j>0;j--)
					System.out.printf("\t");
				
				for(k=x;k>0;k--)
					System.out.printf("%d\t", k);
				
				s+=2;
				
			}
			
			System.out.println();
			
		}
		
		for(a=2;a<=n;a++) {
			
			if(a != n) {
				
				for(p=1;p<=a;p++)
					System.out.printf("%d\t", p);
				
				for(q=1;q<=t;q++)
					System.out.printf("\t");
				
				for(r=a;r>0;r--)
					System.out.printf("%d\t", r);
				
				t-=2;
				
			}else {
				
				for(b=1;b<=a;b++)
					System.out.printf("%d\t", b);
				
				for(c=a-1;c>0;c--)
					System.out.printf("%d\t", c);
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
