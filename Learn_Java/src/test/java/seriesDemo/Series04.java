package seriesDemo;

import java.util.Scanner;

//S = 2 - 4 + 6 - 8 +…….upto n terms

public class Series04 {

	public static void main(String[] args) {
		
		int j=0, k=0, s=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");
		
		int n = sc.nextInt();
		
		System.out.println("The series is : ");
		for(int i=1; i<=n; i++) {
			
			if(i%2 == 0) {
				j = i*(-2);
				s+=j;
				System.out.print(j+", ");
			}else {
				k = i*2;
				s+=k;
				System.out.print(k+", ");
			}
			
		}
		
		System.out.println("\nThe sum of the series upto "+n+" terms is : "+s);
		
		sc.close();

	}

}
