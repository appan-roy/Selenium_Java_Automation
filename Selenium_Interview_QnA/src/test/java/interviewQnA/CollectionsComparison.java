package interviewQnA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsComparison {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("JavaScript");
		list1.add("Python");

		List<String> list2 = new ArrayList<String>();
		list2.add("Python");
		list2.add("JavaScript");
		list2.add("Java");
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1.equals(list2));
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Java");
		set1.add("JavaScript");
		set1.add("Python");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("Python");
		set2.add("JavaScript");
		set2.add("Java");
		
		System.out.println(set1.equals(set2));
		
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		map1.put("Programs", list1);
		
		Map<String, List<String>> map2 = new HashMap<String, List<String>>();
		map2.put("Programs", list2);
		
		System.out.println(map1.equals(map2));
		
		System.out.println(map1.keySet().equals(map2.keySet()));
		
		for (List<String> string : map1.values()) {
			for (List<String> string2 : map2.values()) {
				Collections.sort(string);
				Collections.sort(string2);
				System.out.println(string.equals(string2));
			}
		}

	}

}
