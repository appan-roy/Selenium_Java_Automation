package stringDemo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		
		String str = sc.next();
		  
        // getBytes() method to convert string into bytes[]. 
        byte [] strAsByteArray = str.getBytes(); 
  
        byte [] result = new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the result byte[] 
        for (int i = 0; i < strAsByteArray.length; i++) 
            
        	result[i] = strAsByteArray[strAsByteArray.length-1-i]; 
  
        System.out.println(new String(result));
        
        sc.close();

	}

}
