package java.collection.queueConcept;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeConcept {

	public static void main(String[] args) {
		
		/*
		 * ArrayDeque class implements the Deque interface.
		 * It facilitates us to use the Deque.
		 * Unlike queue, we can add or delete the elements from both the ends.
		 * ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
		 */
		
		//generic array deque
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("UFT");
		deque.add("Selenium");
		deque.add("Protractor");
		deque.add("Cypress");
		
		//print the whole deque
		System.out.println("The deque is : "+deque);
		
		//access the head of the deque
		System.out.println("Head : "+deque.element());  
		System.out.println("Head : "+deque.peek());  
		
		//access the elements of deque
		Iterator<String> itr = deque.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		ArrayDeque<String> deque2 = new ArrayDeque<String>();
		
		deque2.add("SoapUI");
		deque2.add("Rest Assured");
		deque2.add("Postman");
		deque2.add("Katalon");
		
		//remove the head
		deque2.remove();
		System.out.println("After removing head, the deque is : "+deque2);
		
		//clear the elements
		deque2.clear();
		System.out.println("After clearing, the deque is : "+deque2);

	}

}
