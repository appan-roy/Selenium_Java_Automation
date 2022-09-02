package loopsDemo;

import java.util.Scanner;

//Co prime numbers are those whose HCF is 1

public class CoPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int m = sc.nextInt();
		
		int n = sc.nextInt();
		
		int c = 0;
		
		int p = (m>n)?m:n;
		
		for(int i=2; i<p; i++) {
			
			if((m%i==0)&&(n%i==0))
				c=1;
			
		}
        
		if(c==0) {
			
			System.out.printf("The numbers %d and %d are co prime", m, n);
			
		}else {
			
			System.out.printf("The numbers %d and %d are not co prime", m, n);
			
		}
		
        sc.close();

	}

}
