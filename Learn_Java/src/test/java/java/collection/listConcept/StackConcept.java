package java.collection.listConcept;

import java.util.Iterator;
import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {
		
		/*
		 * The stack is the subclass of Vector.
		 * It implements the last-in-first-out data structure, i.e., Stack.
		 * The stack contains all of the methods of Vector class and also provides its methods like boolean 
		 * push(), boolean peek(), boolean push(object o), which defines its properties.
		 */
		
		//generic stack
		Stack<String> st1 = new Stack<String>();
		
		st1.push("UFT");
		st1.push("Selenium");
		st1.push("Protractor");
		st1.add("Cypress");
		
		//print the whole stack
		System.out.println("The stack is : "+st1);
		
		//print all the elements of the stack
		//1. for loop
		System.out.println("******* using for loop *********");
		for(int i=0; i<st1.size(); i++)
			System.out.println(st1.get(i));
		
		//2. iterator
		System.out.println("******* using iterator *********");
		Iterator<String> itr = st1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//clone the stack
		Stack<String> st2 = new Stack<String>();
		st2 = (Stack<String>) st1.clone();
		System.out.println("The cloned stack is : "+st2);
		
		//remove element using index
		st1.remove(0);
		
		//removes the last element
		st1.pop();
		
		System.out.println("After removing, the stack is : "+st1);
		
		//clear the stack
		st1.clear();
		System.out.println("After clearing, the stack is : "+st1);

	}

}
