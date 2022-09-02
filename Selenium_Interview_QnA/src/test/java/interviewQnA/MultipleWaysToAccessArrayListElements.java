package interviewQnA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MultipleWaysToAccessArrayListElements {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("JS");

		// 1 - using for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------");

		// 2 - using for each loop
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-----------------------");
		
		// 3 - using while loop
		int i = 0;
		while(i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		System.out.println("-----------------------");

		// 4 - using iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------");

		// 5 - using list iterator
		ListIterator<String> li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("-----------------------");

		// 6 - using lambda function
		list.forEach(s -> System.out.println(s));
		System.out.println("-----------------------");

		// 7 - using iterator with lambda function
		Iterator<String> itr2 = list.iterator();
		itr2.forEachRemaining(s -> System.out.println(s));
		System.out.println("-----------------------");

		// 8 - using list iterator with lambda function
		ListIterator<String> li2 = list.listIterator();
		li2.forEachRemaining(s -> System.out.println(s));
		System.out.println("-----------------------");

		// 9 - reverse order using list iterator
		ListIterator<String> li3 = list.listIterator(list.size());
		while (li3.hasPrevious()) {
			System.out.println(li3.previous());
		}
		System.out.println("-----------------------");

	}

}
