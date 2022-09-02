package arrayDemo;

import java.util.Scanner;

public class MaxMinNumUsingArray {

	public static void main(String[] args) {
				
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array:");
        
        int n = s.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        int max = a[0], min = a[0];
        
        for(int j=0; j<n; j++) {
        	
        	if(a[j]>max)
        		max = a[j];
        	if(a[j]<min)
        		min = a[j];
        	
        }
        
        System.out.println("The maximum number is : "+max);
        
        System.out.println("The minimum number is : "+min);
        
        s.close();

	}

}
