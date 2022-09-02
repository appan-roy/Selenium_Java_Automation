package interviewQnA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateDigitsInNumber {

	public static void main(String[] args) {

		int n = 123424;
		String str = Integer.toString(n);
		char[] charArray = str.toCharArray();
		
		// Method 1
		for(int i = 0; i < charArray.length; i++) {
			for(int j = i+1; j < charArray.length; j++) {
				if(charArray[i] == charArray[j])
					System.out.println(charArray[i]+", ");
			}
		}
		
		// Method 2
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();

		for (Character ch : charArray) {
			if (baseMap.containsKey(ch)) {
				baseMap.put(ch, baseMap.get(ch) + 1);
			} else {
				baseMap.put(ch, 1);
			}
		}
		
		Set<Character> keys = baseMap.keySet();
		
		for (Character ch : keys) {
			if (baseMap.get(ch) > 1) {
				System.out.println(ch + "  is " + baseMap.get(ch) + " times");
			}
		}
		
	}
}
