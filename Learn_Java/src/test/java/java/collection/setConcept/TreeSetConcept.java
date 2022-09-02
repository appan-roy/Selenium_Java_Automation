package java.collection.setConcept;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetConcept {

	public static void main(String[] args) {
		
		/*
		 * Java TreeSet class implements the Set interface that uses a Tree for storage.
		 * Like TreeSet, TreeSet also contains unique elements.
		 * However, the access and retrieval time of TreeSet is quite fast.
		 * The elements in TreeSet stored in ascending order.
		 */
		
		//generic treeset
		TreeSet<String> ts1 = new TreeSet<String>();
		
		ts1.add("Selenium");
		ts1.add("UFT");
		ts1.add("Katalon");
		ts1.add("Protractor");
		
		//print whole tree set
		System.out.println("The tree set is : "+ts1);
		
		//access the elements of the tree set
		//1. enhanced for loop
		System.out.println("********** using enhanced for loop **********");
		for(String str : ts1)
			System.out.println(str);
		
		//clone the tree set
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2 = (TreeSet<String>) ts1.clone();
		System.out.println("The cloned tree set is : "+ts2);
				
		//remove tree set elements
		ts1.remove("Protractor");
		System.out.println("After removing, the tree set is : "+ts1);
		
		//delete tree set element
		ts1.clear();
		System.out.println("After clearing, the tree set is : "+ts1);
		
		//generic tree set using set reference
		Set<String> ts3 = new TreeSet<String>();
		
		ts3.add("RFT");
		ts3.add("Cypress");
		ts3.add("SoapUI");
		ts3.add("Postman");
		
		//convert tree set to array list
		ArrayList<String> arrList = new ArrayList<>(ts3);
		
		System.out.println("The converted array list is : "+arrList);

	}

}
