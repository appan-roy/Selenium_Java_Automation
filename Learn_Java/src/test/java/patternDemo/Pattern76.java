package patternDemo;


/*
				1		
			2		2		
		3		3		3		
	4		4		4		4		
5		5		5		5		5		
		6		6		6		
				7			
*/

public class Pattern76 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z;
		
		for(i=1;i<=5;i++) {
			
			for(j=i;j<5;j++)
				System.out.printf("\t");
			
			for(k=1;k<=i;k++)
				System.out.printf("%d\t\t", i);
			
			System.out.println();
			
		}
		
		for(x=6;x<=7;x++) {
			
			for(y=x;y>5;y--)
				System.out.printf("\t\t");
			
			for(z=1;z<=5-((x-5)*2);z++)
				System.out.printf("%d\t\t", x);
			
			System.out.println();
			
		}

	}

}
