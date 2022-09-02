package loopsDemo;

import java.util.Scanner;

//Twin prime no.s are the prime no.s whose difference is 2, e.g. (11,13),(17,19) etc

public class TwinPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int m = sc.nextInt();
		
		int n = sc.nextInt();
		
		int c = 0, d = 0;
		
		if((m<=1)||(n<=1)) {
			
			System.out.println("Wrong input !! Please try again");
			
		}else {
			
			for(int i=2; i<m; i++) {
				
				if(m%i == 0) {
					c = 1;
				}
				
			}
			
			for(int i=2; i<n; i++) {
				
				if(n%i == 0) {
					d = 1;
				}
				
			}
			
		}
        
		if((c==0)&&(d==0)) {
			
			if(Math.abs(m-n)==2) {
				
				System.out.printf("The numbers %d and %d are twin prime", m, n);
				
			}else {
				
				System.out.printf("The numbers %d and %d are not twin prime", m, n);
				
			}
			
		}else {
			
			System.out.printf("Both the numbers %d and %d are not prime", m, n);
			
		}
        
        sc.close();

	}

}
