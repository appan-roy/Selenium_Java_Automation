package java.collection.setConcept;

import java.util.LinkedHashSet;

public class LinkedHashSetConcept {

	public static void main(String[] args) {
		
		/*
		 * LinkedHashSet class represents the LinkedList implementation of Set Interface.
		 * It extends the HashSet class and implements Set interface.
		 * Like HashSet, it also contains unique elements.
		 * It maintains the insertion order and permits null elements.
		 */
		
		//linked hash set
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		
		lhs1.add("Maven");
		lhs1.add("Gradle");
		lhs1.add("Jenkins");
		lhs1.add("Docker");
		
		//print the linked hash set
		System.out.println("The linked hash set is : "+lhs1);
		
		//access the elements of the linked hash set
		//1. enhanced for loop
		System.out.println("********** using enhanced for loop **********");
		for(String str : lhs1)
			System.out.println(str);
		
		//clone the hash set
		LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
		lhs2 = (LinkedHashSet<String>) lhs1.clone();
		System.out.println("The cloned linked hash set is : "+lhs2);
		
		//remove a specific element
		lhs1.remove("Docker");
		System.out.println("After removing, the linked hash set is : "+lhs1);
		
		//clear the hash set
		lhs1.clear();
		System.out.println("After clearing, the linked hash set is : "+lhs1);

	}

}
