package java.collection.listConcept;

import java.util.Iterator;
import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		
		/*
		 * Vector uses a dynamic array to store the data elements. 
		 * It is similar to ArrayList. However, It is synchronized and contains many methods that are not the 
		 * part of Collection framework.
		 */
		//generic vector
		Vector<String> v1 = new Vector<String>();
		
		v1.add("UFT");
		v1.add("Selenium");
		v1.add("Protractor");
		
		//print the whole vector
		System.out.println("The vector is : "+v1);
		
		//print all the elements of the vector
		//1. for loop
		System.out.println("******* using for loop *********");
		for(int i=0; i<v1.size(); i++)
			System.out.println(v1.get(i));
		
		//2. iterator
		System.out.println("******* using iterator *********");
		Iterator<String> itr = v1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//clone the vector
		Vector<String> v2 = new Vector<String>();
		v2 = (Vector<String>) v1.clone();
		System.out.println("The cloned vector is : "+v2);
		
		//remove an element
		v1.remove(0);
		System.out.println("After removing, the vector is : "+v1);
		
		//clear the vector
		v1.clear();
		System.out.println("After clearing, the vector is : "+v1);

	}

}
