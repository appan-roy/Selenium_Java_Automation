package interviewQnA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {

		String str = new String("Selenium");

		// Method 1
		char[] strArr = str.toCharArray();

		char[] revArr = new char[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
			revArr[i] = strArr[strArr.length - 1 - i];
		}

		System.out.println(new String(revArr));

		// Method 2
		char[] stringArr = str.toCharArray();

		for (int i = stringArr.length - 1; i >= 0; i--) {
			System.out.print(stringArr[i]);
		}

		System.out.println();

		// Method 3
		byte[] strAsByteArray = str.getBytes();

		byte[] revByteArray = new byte[strAsByteArray.length];

		for (int i = 0; i < strAsByteArray.length; i++) {
			revByteArray[i] = strAsByteArray[strAsByteArray.length - 1 - i];
		}

		System.out.println(new String(revByteArray));

		// Method 4
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}

		System.out.println(revStr);

		// Method 5
		int strLen = str.length();
		while (strLen > 0) {
			System.out.print(str.charAt(strLen - 1));
			strLen--;
		}

		System.out.println();

		// Method 6
		int strLength = str.length();
		for (int i = strLength - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		// Method 7
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append(str);
		System.out.println(sbuffer.reverse());

		// Method 8
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append(str);
		System.out.println(sbuilder.reverse());

		// Method 9
		char[] chArr = str.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (char c : chArr)
			list.add(c);

		Collections.reverse(list);

		ListIterator<Character> li = list.listIterator();

		while (li.hasNext())
			System.out.print(li.next());
		System.out.println();
		
		// Method 10
		char[] chArr1 = str.toCharArray();
		int counter = str.length();
		char[] revArr1 = new char[counter];

		int i = 0;
		while(i < counter){
			revArr1[i] = chArr1[counter-1-i];
			i++;
		}

		System.out.println(new String(revArr1));

	}

}
