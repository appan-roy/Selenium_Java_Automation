package numberConverterDemo;

import java.util.Scanner;

import utility.ConverterUtils;

public class HexToBinary {

	public static void main(String[] args) {
		
		ConverterUtils cu = new ConverterUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a hexadecimal number : ");
		
		String hex = sc.next();
		
		String bin = cu.hexToBinary(hex);
		
		System.out.println("The binary equivalent of " + hex + " is " + bin);

		sc.close();

	}

}
