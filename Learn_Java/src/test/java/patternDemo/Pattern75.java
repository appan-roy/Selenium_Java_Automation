package patternDemo;


/*
				1		
		2		2		2		
3		3		3		3		3		
	4		4		4		4		
		5		5		5		
			6		6		
				7	
*/

public class Pattern75 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z;
		
		for(i=1;i<=3;i++) {
			
			for(j=i;j<3;j++)
				System.out.printf("\t\t");
			
			for(k=1;k<=(i*2-1);k++)
				System.out.printf("%d\t\t", i);
			
			System.out.println();
			
		}
		
		for(x=4;x<=7;x++) {
			
			for(y=x;y>3;y--)
				System.out.printf("\t");
			
			for(z=1;z<=8-x;z++)
				System.out.printf("%d\t\t", x);
			
			System.out.println();
			
		}

	}

}
