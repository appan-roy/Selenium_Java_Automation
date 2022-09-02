package seriesDemo;

import java.util.Scanner;

//S = (1+2!) + (2+3!) + (3+4!) + (4+5!) +………upto n terms

public class Series13 {

	public static void main(String[] args) {

		long s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();

		System.out.println("The series is : ");
		for (int i = 1; i <= n; i++) {

			System.out.print("("+i+"+"+(i+1)+"!), ");
			
			s+=i+factorial(i+1);

		}

		System.out.println("\nThe sum of the series upto " + n + " terms is : " + s);

		sc.close();

	}
	
	
	static long factorial(int x) {
		
		int f=1;
		
		while(x>0) {
			f*=x;
			x--;
		}
		
		return f;
		
	}

}
