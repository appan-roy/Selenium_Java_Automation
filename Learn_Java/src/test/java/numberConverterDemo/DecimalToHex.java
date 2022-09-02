package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;

public class DecimalToHex {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a decimal number : ");
		
		int dec = sc.nextInt();
		
		String hex = cu.decimalToHex(dec);
		
		System.out.println("The hexadecimal equivalent of " + dec + " is " + hex);
		
		sc.close();

	}

}
