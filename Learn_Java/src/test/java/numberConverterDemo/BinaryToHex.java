package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;
import utility.NumberUtils;

public class BinaryToHex {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a binary number : ");
		
		long bin = sc.nextLong();
		
		int counter = 0;
		
		int dec = 0;
		
		String hex = null;

		for(int i = 2; i < 10; i++) {
			
			if(nu.presenceOfDigit(bin, i))
				counter++;
			else {
				dec = cu.binaryToDecimal(bin);
				hex = cu.decimalToHex(dec);
			}
			
		}
		
		if(counter == 0)
			System.out.println("The hexadecimal equivalent of " + bin + " is " + hex);
		else
			System.out.println("Invalid input !! The number " + bin + " is not a binary number");

		sc.close();

	}

}
