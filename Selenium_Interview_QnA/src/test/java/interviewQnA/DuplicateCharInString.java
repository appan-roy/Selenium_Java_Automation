package interviewQnA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {

		// Method 1
		String str = "mbappe";
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					System.out.println(str.charAt(i)+", ");
			}
		}
		
		// Method 2
		char[] chArr = str.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			for(int j = i+1; j < chArr.length; j++) {
				if(chArr[i] == chArr[j])
					System.out.println(chArr[i]+", ");
			}
		}
		
		// Method 3
		String str2 = "India is my country";
		char[] charArray = str2.toCharArray();

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
				System.out.println(ch + "  occurred " + baseMap.get(ch) + " times");
			}
		}
		
	}
}
