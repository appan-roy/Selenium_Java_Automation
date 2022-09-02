package seriesDemo;

import java.util.Scanner;

//S = (1) + (1+2) + (1+2+3) + ……upto n terms

public class Series05 {

	public static void main(String[] args) {
		
		int s=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		for(int i=1; i<=n; i++) {
			
			System.out.print("(");
			
			for(int j=1; j<=i; j++) {
				
				if(j != i)
					System.out.print(j+"+");
				else
					System.out.print(j+"");
				
				s+=j;
				
			}
			
			System.out.print("), ");
			
		}
		
		System.out.println("\nThe sum of the series upto "+n+" terms is : "+s);
		
		sc.close();

	}

}
