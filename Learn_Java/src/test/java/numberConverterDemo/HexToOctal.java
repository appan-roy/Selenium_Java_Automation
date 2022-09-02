package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;

public class HexToOctal {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a hexadecimal number : ");
		
		String hex = sc.next();
		
		int dec = cu.hexToDecimal(hex);
		
		int oct = cu.decimalToOctal(dec);
		
		System.out.println("The octal equivalent of " + hex + " is " + oct);

		sc.close();

	}

}
