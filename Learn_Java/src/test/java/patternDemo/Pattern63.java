package patternDemo;

import java.util.Scanner;

/*
1	1	1	1	1	1	1	1	1	
2	2	2	2		2	2	2	2	
3	3	3				3	3	3	
4	4						4	4	
5								5	
4	4						4	4	
3	3	3				3	3	3	
2	2	2	2		2	2	2	2	
1	1	1	1	1	1	1	1	1	
*/

public class Pattern63 {

	public static void main(String[] args) {
		
		int x,y,i,j,k,a,b,p,q,r,s=1,t;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		t = 2*n-5;
		
		for(x=1;x<=n;x++) {
			
			if(x == 1) {
				
				for(y=x;y<=(2*n-1);y++)
					System.out.printf("%d\t", x);
				
			}else {
				
				for(i=x;i<=n;i++)
					System.out.printf("%d\t", x);
					
				for(j=s;j>0;j--)
					System.out.printf("\t");
				
				for(k=x;k<=n;k++)
					System.out.printf("%d\t", x);
				
				s+=2;
				
			}
			
			System.out.println();
			
		}
		
		for(a=n-1;a>0;a--) {
			
			if(a != 1) {
				
				for(p=a;p<=n;p++)
					System.out.printf("%d\t", a);
				
				for(q=1;q<=t;q++)
					System.out.printf("\t");
				
				for(r=a;r<=n;r++)
					System.out.printf("%d\t", a);
				
				t-=2;
				
			}else {
				
				for(b=1;b<=(2*n-1);b++)
					System.out.printf("%d\t", a);
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
