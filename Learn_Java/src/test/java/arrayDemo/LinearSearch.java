package arrayDemo;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int n, num, flag = 0;
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array:");
        
        n = s.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        System.out.print("Enter the no. you want to search : ");
        
        num = s.nextInt();
        
        for(int j=0; j<n; j++) {
        	
        	if(num==a[j]) {
        		flag = 1;
        		break;
        	}
        	
        }
        
        if(flag==1)
        	System.out.println("The number "+num+" is present in the array");
        else
        	System.out.println("The number "+num+" is not present in the array");
        
        s.close();

	}

}
