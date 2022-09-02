package java.collection.setConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		
		/*
		 * HashSet class implements Set Interface.
		 * It represents the collection that uses a hash table for storage.
		 * Hashing is used to store the elements in the HashSet.
		 * It contains unique items.
		 */
		
		//generic hashset
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("Selenium");
		hs1.add("UFT");
		hs1.add("Katalon");
		hs1.add("Protractor");
		
		//print whole hash set
		System.out.println("The hash set is : "+hs1);
		
		//access the elements of the hash set
		//1. enhanced for loop
		System.out.println("********** using enhanced for loop **********");
		for(String str : hs1)
			System.out.println(str);
		
		//clone the hash set
		HashSet<String> hs2 = new HashSet<String>();
		hs2 = (HashSet<String>) hs1.clone();
		System.out.println("The cloned hash set is : "+hs2);
				
		//remove hash set elements
		hs1.remove("Protractor");
		System.out.println("After removing, the hash set is : "+hs1);
		
		//delete hash set element
		hs1.clear();
		System.out.println("After clearing, the hash set is : "+hs1);
		
		//generic hashset using set reference
		Set<String> hs3 = new HashSet<String>();
		
		hs3.add("RFT");
		hs3.add("Cypress");
		hs3.add("SoapUI");
		hs3.add("Postman");
		
		//convert hash set to array list
		ArrayList<String> arrList = new ArrayList<>(hs3);
		
		System.out.println("The converted array list is : "+arrList);

	}

}
