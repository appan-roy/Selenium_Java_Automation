package seriesDemo;

import java.util.Scanner;

//S = (1) + (x^2/1!) + (x^3/2!) + (x^4/3!) +………upto n terms

public class Series18 {

	public static void main(String[] args) {

		double s = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();
		
		System.out.println("Enter the value of base x : ");

		int x = sc.nextInt();

		System.out.println("The series is : ");
		System.out.print("(1), ");
		for (int i = 1; i < n; i++) {

			System.out.print("("+x+"^"+(i+1)+"/"+i+"!), ");
			
			s+=Math.pow(x, (i+1))/factorial(i);

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
