package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;
import utility.NumberUtils;

public class BinaryToOctal {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a binary number : ");
		
		long bin = sc.nextLong();
		
		int counter = 0;
		
		int dec = 0;
		
		long oct = 0;

		for(int i = 2; i < 10; i++) {
			
			if(nu.presenceOfDigit(bin, i))
				counter++;
			else {
				dec = cu.binaryToDecimal(bin);
				oct = cu.decimalToOctal(dec);
			}
			
		}
		
		if(counter == 0)
			System.out.println("The octal equivalent of " + bin + " is " + oct);
		else
			System.out.println("Invalid input !! The number " + bin + " is not a binary number");

		sc.close();

	}

}
