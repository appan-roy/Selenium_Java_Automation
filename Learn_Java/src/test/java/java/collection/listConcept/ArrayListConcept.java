package java.collection.listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int arr[] = new int [10];	//static array --- size is fixed
		
		/*
		 * The ArrayList class implements the List interface.
		 * It uses a dynamic array to store the duplicate element of different data types.
		 * The ArrayList class maintains the insertion order and is non-synchronized.
		 * The elements stored in the ArrayList class can be randomly accessed.
		 */
		
		//generic vs non-generic
		
		//non generic arraylist
		ArrayList arrList = new ArrayList();
		
		arrList.add(10);
		arrList.add(7.17);
		arrList.add("A");
		arrList.add("Java");
		arrList.add("Java");	//duplicate value is allowed
		arrList.add(true);
		
		//print the whole list
		System.out.println("The arraylist is : "+arrList);
		
		//to print all values from arraylist
		//1. for loop
		System.out.println("************ using for loop ***********");
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		//2. enhanced for loop
		System.out.println("************ using enhanced for loop ***********");
		for(Object i:arrList)
			System.out.println(i);
		
		//3. lambda expression
		System.out.println("************ using lambda expression ***********");
		arrList.forEach(item->{
			System.out.println(item);
		});
		
		//4. iterator
		System.out.println("************ using iterator ***********");
		Iterator it = arrList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//5. lambda and for each
		System.out.println("************ using lambda and for each ***********");
		it = arrList.iterator();
		it.forEachRemaining(item ->{
			System.out.println(item);
		});
		
		//6. listiterator() to traverse in reverse order
		System.out.println("************ using listiterator() to traverse in reverse order ***********");
		ListIterator listIterator = arrList.listIterator(arrList.size());
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
		//Initialize list with arraylist reference. Arraylist implements lists.
		List<String> arrlist = new ArrayList<String>();
		
		arrlist.add("Web App Testing");
		arrlist.add("Desktop App Testing");
		arrlist.add("Mobile App Testing");
		arrlist.add("API Testing");
		
		for(String s:arrlist)
			System.out.println(s);

		//generic arraylist
		ArrayList<String> aList1 = new ArrayList<String>();
		
		aList1.add("Selenium");
		aList1.add("Appium");
		aList1.add("Rest Assured");
		
		ArrayList<String> aList2 = new ArrayList<String>();
		
		aList2.add("Katalon");
		aList2.add("QTP");
		aList2.add("UiPath");
		
		//merge the arraylists in aList1
		aList1.addAll(aList2);
		
		//now access all elements from aList1
		for(int i=0; i<aList1.size(); i++) {
			System.out.println(aList1.get(i));
		}
		
		//remove the arraylist aList2 from aList1
		aList1.removeAll(aList2);
		
		//now access all elements from aList1
		for(int i=0; i<aList1.size(); i++) {
			System.out.println(aList1.get(i));
		}
		
		ArrayList<String> aList3 = new ArrayList<String>();
		
		aList3.add("Selenium");
		aList3.add("QTP");
		aList3.add("UiPath");
		
		//get common elements from aList1 and aList3
		aList1.retainAll(aList3);
		
		//now access all elements from aList1
		for(int i=0; i<aList1.size(); i++) {
			System.out.println(aList1.get(i));
		}
		
		//Employee class object
		Employee e1 = new Employee("John", 101, "QA");
		Employee e2 = new Employee("Peter", 102, "Dev");
		Employee e3 = new Employee("Jill", 103, "Admin");
		
		//create employee type arraylist
		ArrayList<Employee> aListEmp = new ArrayList<Employee>();
		
		aListEmp.add(e1);
		aListEmp.add(e2);
		aListEmp.add(e3);
		
		//access the values using iterator
		Iterator<Employee> itr = aListEmp.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.empName);
			System.out.println(emp.empId);
			System.out.println(emp.dept);
		}

	}

}
