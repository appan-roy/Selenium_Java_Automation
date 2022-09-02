package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;

public class DecimalToOctal {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a decimal number : ");
		
		int dec = sc.nextInt();
		
		int oct = cu.decimalToOctal(dec);
		
		System.out.println("The octal equivalent of " + dec + " is " + oct);
		
		sc.close();

	}

}
