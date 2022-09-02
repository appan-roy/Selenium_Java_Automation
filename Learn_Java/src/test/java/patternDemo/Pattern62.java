package patternDemo;

import java.util.Scanner;

/*
5								5	
4	5						5	4	
3	4	5				5	4	3	
2	3	4	5		5	4	3	2	
1	2	3	4	5	4	3	2	1	
2	3	4	5		5	4	3	2	
3	4	5				5	4	3	
4	5						5	4	
5								5	
*/

public class Pattern62 {

	public static void main(String[] args) {
		
		int i,j,k,l,m,x,y,z,w,p=0,q=1,r;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		p = (2*(n-1)-1);
		
		for(i=n;i>0;i--) {
			
			if(i != 1) {
				
				for(j=i;j<=n;j++)
					System.out.printf("%d\t", j);
				
				for(k=1;k<=p;k++)
					System.out.printf("\t");
				
				for(l=n;l>=i;l--)
					System.out.printf("%d\t", l);
				
				p-=2;
				
			}else {
				
				for(m=i;m<=n;m++)
					System.out.printf("%d\t", m);
				
				for(r=n-1;r>=i;r--)
					System.out.printf("%d\t", r);

			}
	
			System.out.println();
			
		}
		
		for(x=2;x<=n;x++) {
			
			for(y=x;y<=n;y++)
				System.out.printf("%d\t", y);
			
			for(z=q;z>0;z--)
				System.out.printf("\t");
			
			for(w=n;w>=x;w--)
				System.out.printf("%d\t", w);
			
			q+=2;
			
			System.out.println();
			
		}

		sc.close();

	}

}
