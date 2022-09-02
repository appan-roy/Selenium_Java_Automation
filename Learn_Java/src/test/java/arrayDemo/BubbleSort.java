package arrayDemo;

import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		
		int n, temp=0;
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array:");
        
        n = s.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter all the elements:");
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }

        for(int k = 0; k < n; k++) {
           for(int j=1; j < (n-k); j++) {
              if(arr[j-1] > arr[j]) {
                 temp = arr[j-1];
                 arr[j-1] = arr[j];
                 arr[j] = temp;
              }
           }
        }
        
        System.out.println("The sorted array is : ");
        
        for(int m=0; m<n; m++)
        	System.out.print(arr[m]+" ");
        
        s.close();

	}

}
