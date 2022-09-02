package arrayDemo;

import java.util.Scanner;

public class SetOfConsecutiveNum {

	public static void main(String[] args) {
		
		int n, c = 0;
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array:");
        
        n = s.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        for(int j = 0; j < (n-1); j++)
        {
        	if(a[j+1]==(a[j]+1))
        		c++;
        }
           
        System.out.println("Total number of consecutive number sets : "+c);
        
        s.close();

	}

}
