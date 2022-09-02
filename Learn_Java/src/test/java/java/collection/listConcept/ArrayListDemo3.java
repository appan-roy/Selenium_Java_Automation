package java.collection.listConcept;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList arrlist = new ArrayList();
		
		arrlist.add(8264738);
		
		arrlist.add("D");
		
		arrlist.add(34.67);
		
		arrlist.add("Appan");
		
		arrlist.add("Roy");
		
		int listSize = arrlist.size();
		
		for(Object i:arrlist){
			
			System.out.println("Values from array list is "+i);
			
		}

	}

}
