package java.collection.setConcept;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hash = new LinkedHashSet<>();
		
		hash.add("Selenium");
		
		hash.add("1");
		
		hash.add("M");
		
		hash.add("Robot Framework");
		
		hash.add("HP UFT");
		
		for(String s:hash){
			
			System.out.println(s);
			
		}

	}

}
