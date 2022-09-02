package java.collection.mapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//HashTable is synchronized -- thread safe
		//key-->object--hashcode-->value
		//no null key or null value is allowed in hashtable
		//duplicate values are ignored in hashtable, it won't be stored
		
		//any type of key-value pair is allowed for this hashtable...non generic type
		Hashtable h1 = new Hashtable();
		
		h1.put(1, 100);
		h1.put(2, "John");
		h1.put("A", 200);
		h1.put("B", "Jill");
		
		int htLength = h1.size();
		System.out.println("Size of the hash table : "+htLength);
		
		System.out.println(h1.get(1)+"|"+h1.get(2)+"|"+h1.get("A")+"|"+h1.get("B"));
		
		//create a clone copy
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)h1.clone();
		
		System.out.println("The values from h1 : "+h1);
		System.out.println("The values from h2 : "+h2);
		
		//clear the hashtable
		h1.clear();
		
		System.out.println("The values from h1 : "+h1);
		System.out.println("The values from h2 : "+h2);
		
		//restriction in key-value pair...generic type
		Hashtable<Integer, String> h3 = new Hashtable<Integer, String>();
		
		h3.put(1, "UFT");
		h3.put(2, "RFT");
		h3.put(3, "Cypress");
		h3.put(4, "Protractor");
		h3.put(5, "Selenium");
		
		//print all the values from hashtable using enumeration -- elements()
		Enumeration e = h3.elements();
		System.out.println("The elements from h3 is : ");
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		//print all the values from hashtable using entrySet() -- set of hashtable values
		System.out.println("The elements from h3 is : ");
		Set s = h3.entrySet();
		System.out.println(s);
		
		//check if two hashtables are equal or not
		Hashtable<Integer, String> h4 = new Hashtable<Integer, String>();
		
		h4.put(1, "UFT");
		h4.put(2, "RFT");
		h4.put(3, "Cypress");
		h4.put(4, "Protractor");
		h4.put(5, "Selenium");
		
		if(h3.equals(h4))
			System.out.println("the hashtable h3 and h4 are equal");
		
		//get the value from a key
		System.out.println(h4.get(1));
		
		//get the hashcode of a hashtable object
		System.out.println("The hash code value of hashtable h4 : "+h4.hashCode());

	}

}
