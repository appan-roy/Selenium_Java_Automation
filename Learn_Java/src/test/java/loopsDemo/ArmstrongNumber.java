package loopsDemo;

import java.util.Scanner;

//153 is an Armstrong no. because 1^3+5^3+3^3=153. More example:- 370,371,407

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int number = sc.nextInt();
		
		int a, s = 0, d;
		
		d = number;
		
		while(d != 0) {
			
			a=d%10;
			s+=(a*a*a);
			d/=10;
			
		}
		
		if(s == number) {
			System.out.println("The number "+number+" is an armstrong number");
		}else {
			System.out.println("The number "+number+" is not an armstrong number");
		}
		
		sc.close();

	}

}
