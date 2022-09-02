package conditionalStatementDemo;

import java.util.Scanner;

public class CheckTrianglePossible {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of three sides of the triangle : ");
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		if((a+b>c) && (b+c>a) && (c+a>b)) {
			
			System.out.println("Triangle is possible");
			
			if((a==b) && (b==c)) {
				
				System.out.println("The tringle is equilateral");
				
			}else if((a==b) || (b==c) || (c==a)) {
				
				System.out.println("The tringle is isosceles");
				
			}else {
				
				System.out.println("The tringle is scalene");
				
			}
			
		}else {
			
			System.out.println("Sorry !! Triangle is not possible");
			
		}

		sc.close();

	}

}
