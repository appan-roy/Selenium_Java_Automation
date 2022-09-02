package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;

public class HexToDecimal {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a hexadecimal number : ");
		
		String hex = sc.next();
		
		long dec = cu.hexToDecimal(hex);
		
		System.out.println("The decimal equivalent of " + hex + " is " + dec);

		sc.close();

	}

}
