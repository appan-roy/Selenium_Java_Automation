package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;
import utility.NumberUtils;

public class OctalToBinary {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an octal number : ");
		
		long oct = sc.nextLong();
		
		int counter = 0;
		
		int dec = 0;
		
		long bin = 0;
		
		for(int i = 8; i < 10; i++) {
			
			if(nu.presenceOfDigit(oct, i))
				counter++;
			else {
				dec = cu.octalToDecimal(oct);
				bin = cu.decimalToBinary(dec);
			}
			
		}
		
		if(counter == 0)
			System.out.println("The binary equivalent of " + oct + " is " + bin);
		else
			System.out.println("Invalid input !! The number " + oct + " is not an octal number");
		
		sc.close();

	}

}
