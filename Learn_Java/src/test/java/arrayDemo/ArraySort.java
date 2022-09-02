package arrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		
		int n;
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array:");
        
        n = s.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        Arrays.sort(a);
        
        System.out.printf("The sorted array is : %s", Arrays.toString(a));
        
        s.close();

	}

}
