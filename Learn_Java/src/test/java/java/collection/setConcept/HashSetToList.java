package java.collection.setConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetToList {

	public static void main(String[] args) {
		
		Set<String> hash = new HashSet<>();
		
		hash.add("Selenium");
		
		hash.add("1");
		
		hash.add("M");
		
		hash.add("Robot Framework");
		
		hash.add("HP UFT");
		
		System.out.println(hash);
		
		ArrayList<String> list = new ArrayList<>(hash);
		
		System.out.println(list.get(3));

	}

}
