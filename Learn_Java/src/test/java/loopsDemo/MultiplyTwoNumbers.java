package loopsDemo;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int n1 = sc.nextInt();
		
		int n2 = sc.nextInt();
		
		int result = 0;
		
		for(int i = 1; i <= n2; i++)
        {
            result = result + n1;
        }

        System.out.printf("The result is %d", result);
        
        sc.close();

	}

}
