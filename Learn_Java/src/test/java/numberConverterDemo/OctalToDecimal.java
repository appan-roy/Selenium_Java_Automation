package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;
import utility.NumberUtils;

public class OctalToDecimal {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an octal number : ");
		
		long oct = sc.nextLong();
		
		int counter = 0;
		
		int dec = 0;
		
		for(int i = 8; i < 10; i++) {
			
			if(nu.presenceOfDigit(oct, i))
				counter++;
			else
				dec = cu.octalToDecimal(oct);
			
		}
		
		if(counter == 0)
			System.out.println("The decimal equivalent of " + oct + " is " + dec);
		else
			System.out.println("Invalid input !! The number " + oct + " is not an octal number");
		
		sc.close();

	}

}
