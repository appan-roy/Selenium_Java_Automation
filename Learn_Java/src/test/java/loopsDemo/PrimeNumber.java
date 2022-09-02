package loopsDemo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		boolean flag = false;
		
		if(num>0) {
			
			if(num==1) {
				
				System.out.println(num + " is not a prime number.");
				
			}else if(num==2) {
				
				System.out.println(num + " is a prime number.");
				
			}else{
				
				for(int i = 2; i <= num/2; ++i)
		        {
		            // condition for non-prime number
		            if(num % i == 0)
		            {
		                flag = true;
		                break;
		            }
		        }
				
				if (!flag)
		            System.out.println(num + " is a prime number.");
		        else
		            System.out.println(num + " is not a prime number.");
				
			}
			
		}else {
			
			System.out.println("Sorry !! You have entered either zero or a negative number");
			
		}
		
		sc.close();

	}

}
