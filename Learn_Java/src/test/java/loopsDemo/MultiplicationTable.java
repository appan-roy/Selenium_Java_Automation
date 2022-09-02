package loopsDemo;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base number : ");
		
		int number = sc.nextInt();
		
		System.out.println("Enter the number of terms : ");
		
		int terms = sc.nextInt();
		
		for(int i=1; i<=terms; i++) {
			
			int res = number * i;
			
			System.out.printf("%d*%d=%d\n",number,i,res);
			
		}
		
		sc.close();

	}

}
