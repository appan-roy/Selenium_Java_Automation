package interviewQnA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String[] arr = { "UFT", "Selenium", "Katalon", "Appium", "UFT", "Rest Assured", "Postman", "Selenium" };

		// Method 1
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]))
					System.out.println(arr[i]);
			}
		}

		// Method 2
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < arr.length; i++) {
			if (set.add(arr[i]) == false)
				System.out.println(arr[i]);
		}

		// Method 3
		Map<String, Integer> hmap = new HashMap<String, Integer>();

		for (String string : arr) {
			if (hmap.containsKey(string))
				hmap.put(string, hmap.get(string) + 1);
			else
				hmap.put(string, 1);
		}

		Set<String> mySet = hmap.keySet();

		for (String string : mySet) {
			if (hmap.get(string) > 1)
				System.out.println(string);
		}

	}

}
