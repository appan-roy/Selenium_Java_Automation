package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a decimal number : ");
		
		int dec = sc.nextInt();
		
		long bin = cu.decimalToBinary(dec);
		
		System.out.println("The binary equivalent of " + dec + " is " + bin);
		
		sc.close();

	}

}
