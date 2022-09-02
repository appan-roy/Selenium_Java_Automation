package utility;

public class StringUtils {
	
	public String reverseString (String str) {
		
		// getBytes() method to convert string into bytes[]. 
        byte [] strAsByteArray = str.getBytes(); 
  
        byte [] result = new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the result byte[] 
        for (int i = 0; i < strAsByteArray.length; i++) 
            
        	result[i] = strAsByteArray[strAsByteArray.length-1-i];
		
        return new String(result); 

	}
	
	public boolean isPalindrome(String str) {
		
		if(reverseString(str).equals(str))
			return true;
		else
			return false;
		
	}
	
	public int numOfOccurenceOfChar(String str, String ch) {
		
		String strArr [] = str.split("");
		
		int count = 0;
		
		for(String item : strArr) {
			
			if(item.equals(ch))
				count++;
			
		}

		return count;

	}
	
}
