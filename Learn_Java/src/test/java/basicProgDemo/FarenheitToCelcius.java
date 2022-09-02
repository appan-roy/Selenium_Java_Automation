package basicProgDemo;

import java.util.Scanner;

public class FarenheitToCelcius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature in Farenheit: ");
		
		float f = sc.nextFloat();
		
		float c = 5*(f-32)/9;
		
		System.out.println("The Celcius temperature is: "+c);
		
		sc.close();
		
	}

}
