package java.collection.setConcept;

import java.util.HashSet;

public class Hash_Set2 {

	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<>();
		
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
