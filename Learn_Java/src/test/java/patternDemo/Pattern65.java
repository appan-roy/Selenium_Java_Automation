package patternDemo;

import java.util.Scanner;

/*
5	4	3	2	1	2	3	4	5	
5	4	3	2		2	3	4	5	
5	4	3				3	4	5	
5	4						4	5	
5								5	
5	4						4	5	
5	4	3				3	4	5	
5	4	3	2		2	3	4	5	
5	4	3	2	1	2	3	4	5	
*/

public class Pattern65 {

	public static void main(String[] args) {
		
		int x,y,z,i,j,k,a,b,c,p,q,r,s=1,t;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		t = 2*n-5;
		
		for(x=1;x<=n;x++) {
			
			if(x == 1) {
				
				for(y=n;y>=x;y--)
					System.out.printf("%d\t", y);
				
				for(z=x+1;z<=n;z++)
					System.out.printf("%d\t", z);
				
			}else {
				
				for(i=n;i>=x;i--)
					System.out.printf("%d\t", i);
					
				for(j=s;j>0;j--)
					System.out.printf("\t");
				
				for(k=x;k<=n;k++)
					System.out.printf("%d\t", k);
				
				s+=2;
				
			}
			
			System.out.println();
			
		}
		
		for(a=n-1;a>0;a--) {
			
			if(a != 1) {
				
				for(p=n;p>=a;p--)
					System.out.printf("%d\t", p);
				
				for(q=1;q<=t;q++)
					System.out.printf("\t");
				
				for(r=a;r<=n;r++)
					System.out.printf("%d\t", r);
				
				t-=2;
				
			}else {
				
				for(b=n;b>=a;b--)
					System.out.printf("%d\t", b);
				
				for(c=a+1;c<=n;c++)
					System.out.printf("%d\t", c);
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
