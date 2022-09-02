package arrayDemo;

import java.util.Scanner;

public class DuplicateNumInArray {

	public static void main(String[] args) {
		
		int n, flag;
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array:");
        
        n = s.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        for(int j=0; j<n; j++) {
        	
        	flag = 0;
        	
        	for(int k=j+1; k<n; k++) {
        		
        		if(a[j]==a[k])
        			flag++;
        		
        	}
        	
        	if(flag == 1)
        		System.out.println("The duplicate numbers is : "+a[j]);
        	
        }

        s.close();

	}

}
