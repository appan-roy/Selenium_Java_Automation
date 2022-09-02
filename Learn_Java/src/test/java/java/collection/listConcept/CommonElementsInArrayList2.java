package java.collection.listConcept;

import java.util.ArrayList;
import java.util.stream.*; 

public class CommonElementsInArrayList2 { 

	// main method 
	public static void main(String[] args) 
	{ 

		// create ArrayList list1 
		ArrayList<String> list1 = new ArrayList<String>(); 

		// Add values in ArrayList 
		list1.add("Hii"); 
		list1.add("Geeks"); 
		list1.add("for"); 
		list1.add("Geeks"); 

		// print list 1 
		System.out.println("List1 : "+ list1); 

		// Create ArrayList list2 
		ArrayList<String> list2 = new ArrayList<String>(); 

		// Add values in ArrayList 
		list2.add("Hii"); 
		list2.add("Geeks"); 
		list2.add("Appan"); 

		// print list 2 
		System.out.println("List2 : "+ list2); 

		// Find common elements 
		System.out.print("Common elements: "); 
		System.out.println(list1.stream().filter(list2::contains).collect(Collectors.toList()));
		
	}
	
}
