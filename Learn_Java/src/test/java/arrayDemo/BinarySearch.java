package arrayDemo;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int n, num, flag=0, m=0;
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array : ");
        
        n = s.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter all the elements (ascending order) : ");
        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        int l=0, u=n-1;
        
        System.out.print("Enter the no. you want to search : ");
        
        num = s.nextInt();
        
        while(l<=u) {
        	
        	m=(l+u)/2;
        	
        	if(num>a[m])
        		l=m+1;
        	else if(num<a[m])
        		u=m-1;
        	else {
        		flag=1;
        		break;
        	}
        	
        }

        if(flag==1)
        	System.out.println("The number "+num+" is present in the array at the position "+(m+1));
        else
        	System.out.println("The number "+num+" is not present in the array");
        
        s.close();

	}

}
