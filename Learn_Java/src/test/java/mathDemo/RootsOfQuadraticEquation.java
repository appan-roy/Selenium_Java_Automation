package mathDemo;

import java.util.Scanner;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		
		//Determine the roots of the quadratic equation ax^2 + bx + c = 0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of the three coefficients a,b,c : ");
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		double d = Math.sqrt(b*b - 4*a*c);
		
		if(d>=0) {
			
			double root1 = (-b+d)/(2*a);
			
			double root2 = (-b-d)/(2*a);
			
			System.out.println("The roots are : "+root1+" & "+root2);
			
		}else {
			
			System.out.println("The roots are imaginary");
			
		}
		
		sc.close();

	}

}
