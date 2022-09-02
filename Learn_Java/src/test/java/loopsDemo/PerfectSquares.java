package loopsDemo;

import java.util.Scanner;

public class PerfectSquares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower and upper limits: ");
		
		int lower = sc.nextInt();
		
		int upper = sc.nextInt();
		
		int x;
		
		double y;
		
		System.out.printf("The square no.s are : ");
		
		for(int i = lower; i <= upper; i++)
        {
			x = (int) Math.sqrt(i);
            y = Math.sqrt(i);
            
            if(x==y) {
            	System.out.print("\t"+i);
            }
        }

        sc.close();

	}

}
