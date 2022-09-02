package loopsDemo;

import java.util.Scanner;

public class FindHCF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int n1 = sc.nextInt();
		
		int n2 = sc.nextInt();
		
		int hcf = 1;
		
		for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                hcf = i;
        }

        System.out.printf("H.C.F. of %d and %d is %d", n1, n2, hcf);
        
        sc.close();

	}

}
