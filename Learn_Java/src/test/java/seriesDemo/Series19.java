package seriesDemo;

import java.util.Scanner;

//S = (x^1/1) - (x^3/5) + (x^5/9) - (x^7/13) +………upto n terms
//n-th term = x^(2n-1)/(4n-3)
public class Series19 {

	public static void main(String[] args) {

		double s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms of the series : ");

		int n = sc.nextInt();
		
		System.out.println("Enter the value of base x : ");

		int x = sc.nextInt();

		System.out.println("The series is : ");
		for(int i=1; i<=n; i++) {
			
			System.out.print("("+x+"^"+(2*i-1)+"/"+(4*i-3)+"), ");
			
			if(i%2==0) {
				s-=(Math.pow(x, (2*i-1)))/(4*i-3);
			}else {
				s+=(Math.pow(x, (2*i-1)))/(4*i-3);
			}
			
		}

		System.out.println("\nThe sum of the series upto " + n + " terms is : " + s);

		sc.close();

	}

}
