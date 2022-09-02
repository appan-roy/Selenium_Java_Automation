package java.collection.listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		/*
		 * LinkedList implements the Collection interface.
		 * It uses a doubly linked list internally to store the elements.
		 * It can store the duplicate elements. 
		 * It maintains the insertion order and is not synchronized. 
		 * In LinkedList, the manipulation is fast because no shifting is required.
		 */
		
		//generic linked list
		LinkedList<String> lList = new LinkedList<String>();
		
		//add elements
		lList.add("UFT");
		lList.add("Selenium");
		lList.add("Katalon");
		lList.add("Postman");
		lList.add("UiPath");
		
		//print the whole list
		System.out.println("The linked list is : "+lList);
		
		//add first element
		lList.addFirst("Cypress");
		
		//add last element
		lList.addLast("Protractor");
		
		//print the whole list
		System.out.println("After adding, the linked list is : "+lList);
		
		//set element
		lList.set(0, "SoapUI");
		System.out.println("After changing the first element, the linked list is : "+lList);
		
		//remove first element
		lList.removeFirst();
		
		//remove last element
		lList.removeLast();
		
		//remove using specific index
		lList.remove(2);
		
		//print the whole list
		System.out.println("After removing, the linked list is : "+lList);
		
		//retrieve elements from linked list
		//1. for loop
		System.out.println("***************Using for loop********************");
		for(int i=0; i<lList.size(); i++) {
			System.out.println(lList.get(i));
		}
		
		//2. enhanced for loop
		System.out.println("***************Using enhanced for loop********************");
		for(String str : lList) {
			System.out.println(str);
		}
		
		//3. while loop
		System.out.println("***************Using while loop********************");
		int idx=0;
		while(lList.size() > idx) {
			System.out.println(lList.get(idx));
			idx++;
		}
		
		//4. iterator
		System.out.println("***************Using iterator********************");
		Iterator<String> itr = lList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
