package arrayDemo;

import java.util.Scanner;

public class IdenticalArrays {

	public static void main(String[] args) {
		
		int n, c=0;
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements of the arrays : ");
        
        n = s.nextInt();
        
        int a[] = new int[n];
        int b[] = new int[n];
        
        System.out.println("Enter all the elements of first array:");
        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        System.out.println("Enter all the elements of second array:");
        
        for(int j = 0; j < n; j++)
        {
            b[j] = s.nextInt();
        }
        
        for(int x=0; x<n; x++) {
        	
        	if(a[x]==b[x])
        		c++;
        	
        }
        
        if(c==n)
        	System.out.println("The arrays are identical");
        else
        	System.out.println("the arrays are not identical");
        
        s.close();

	}

}
