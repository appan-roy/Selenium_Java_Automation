package java.collection.queueConcept;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueConcept {

	public static void main(String[] args) {
		
		/*
		 * The PriorityQueue class implements the Queue interface.
		 * It holds the elements or objects which are to be processed by their priorities.
		 * PriorityQueue doesn't allow null values to be stored in the queue.
		 */
		
		//generic priority queue
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("UFT");
		pq1.add("Selenium");
		pq1.add("Protractor");
		pq1.add("Cypress");
		
		//print the whole priority queue
		System.out.println("The priority queue is : "+pq1);
		
		//access the head of the queue
		System.out.println("Head : "+pq1.element());  
		System.out.println("Head : "+pq1.peek());  
		
		//access the elements of priority queue
		Iterator<String> itr = pq1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		PriorityQueue<String> pq2 = new PriorityQueue<String>();
		
		pq1.add("SoapUI");
		pq1.add("Rest Assured");
		pq1.add("Postman");
		pq1.add("Katalon");
		
		//remove the head
		pq1.remove();
		System.out.println("After removing head, the priority queue is : "+pq1);
		
		//clear the elements
		pq1.clear();
		System.out.println("After clearing, the priority queue is : "+pq1);

	}

}
