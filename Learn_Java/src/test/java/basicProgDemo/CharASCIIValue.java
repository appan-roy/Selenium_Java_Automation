package basicProgDemo;

import java.util.Scanner;

public class CharASCIIValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		
		char c = sc.next().charAt(0);
		
		int val = (int)c;
		
		System.out.println("The ASCII value of "+c+" is "+val);
		
		sc.close();

	}

}
