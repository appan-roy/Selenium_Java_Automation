package patternDemo;

import java.util.Scanner;

/*
1	2	3	4	5	4	3	2	1	
2	3	4	5		5	4	3	2	
3	4	5				5	4	3	
4	5						5	4	
5								5	
4	5						5	4	
3	4	5				5	4	3	
2	3	4	5		5	4	3	2	
1	2	3	4	5	4	3	2	1	
*/

public class Pattern66 {

	public static void main(String[] args) {
		
		int x,y,z,i,j,k,a,b,c,p,q,r,s=1,t;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		t = 2*n-5;
		
		for(x=1;x<=n;x++) {
			
			if(x == 1) {
				
				for(y=x;y<=n;y++)
					System.out.printf("%d\t", y);
				
				for(z=n-1;z>=x;z--)
					System.out.printf("%d\t", z);
				
			}else {
				
				for(i=x;i<=n;i++)
					System.out.printf("%d\t", i);
					
				for(j=s;j>0;j--)
					System.out.printf("\t");
				
				for(k=n;k>=x;k--)
					System.out.printf("%d\t", k);
				
				s+=2;
				
			}
			
			System.out.println();
			
		}
		
		for(a=n-1;a>0;a--) {
			
			if(a != 1) {
				
				for(p=a;p<=n;p++)
					System.out.printf("%d\t", p);
				
				for(q=1;q<=t;q++)
					System.out.printf("\t");
				
				for(r=n;r>=a;r--)
					System.out.printf("%d\t", r);
				
				t-=2;
				
			}else {
				
				for(b=a;b<=n;b++)
					System.out.printf("%d\t", b);
				
				for(c=n-1;c>=a;c--)
					System.out.printf("%d\t", c);
				
			}
			
			System.out.println();
			
		}

		sc.close();

	}

}
