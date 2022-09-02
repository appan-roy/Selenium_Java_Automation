package java.collection.listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		ArrayList arrlist = new ArrayList();
		
		arrlist.add(8264738);
		
		arrlist.add("D");
		
		arrlist.add(34.67);
		
		arrlist.add("Appan");
		
		arrlist.add("Roy");
		
		int listSize = arrlist.size();
		
		Iterator itr = arrlist.iterator();
		
		while(itr.hasNext()){
			
			Object value = itr.next();
			
			System.out.println("Values from array list is "+value);
			
		}
		
	}

}
