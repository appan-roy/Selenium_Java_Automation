package java.collection.listConcept;

import java.util.ArrayList;


public class CommonElementsInArrayList3 { 

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

		// Create ArrayList list3 
		ArrayList<String> list3 = new ArrayList<String>(); 

		// Find common elements while iterating through list1 
		for (String temp : list1) { 

			// Check if the element is present in list2 or not 
			if (list2.contains(temp)) { 
				
				// Since present, add it to list3 
				list3.add(temp);
				
			}
			
		} 

		// print common elements from list 3 
		System.out.println("Common elements : "+ list3);
		
		// Create ArrayList list4 
		ArrayList<String> list4 = new ArrayList<String>(); 

		// Find uncommon elements while iterating through list1 against list 2
		for (String temp : list1) { 

			// Check if the element is present in list2 or not 
			if (! list2.contains(temp)) { 
				
				// Since present, add it to list3 
				list4.add(temp);
				
			}
			
		} 

		// print uncommon elements from list 1 against list 2
		System.out.println("Uncommon elements : "+ list4);

	}
	
}
