package java.collection.mapConcept;

import java.collection.listConcept.Employee;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//HashMap extends AbstractMap and implements Map interface
		//It contains only unique elements
		//It stores values as K,V pair
		//It may have null key and null values
		//It maintains no order
		//It is non - synchronized -- not thread safe. multi threads can access HashMap
		//concurrent modification exception -- Fail fast condition
		
		//generic hashmap
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(1, "UFT");
		hMap.put(2, "Selenium");
		hMap.put(3, "RFT");
		hMap.put(4, "Cypress");
		hMap.put(5, "Protractor");
		
		//access particular element using key
		System.out.println(hMap.get(4));
		
		//access all the values from hashmap
		for(Entry m : hMap.entrySet())
			System.out.println(m.getKey()+" : "+m.getValue());
		
		//print the whole hashmap
		System.out.println(hMap);
		
		//remove an element
		hMap.remove(3);
		System.out.println("After removing, the hashmap is : "+hMap);
		
		//HashMap of Employee class object
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Jack", 101, "QA");
		Employee e2 = new Employee("Jill", 102, "Dev");
		Employee e3 = new Employee("John", 103, "Admin");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap
		for(Entry<Integer, Employee> entry : emp.entrySet()) {
			int key = entry.getKey();
			Employee e = entry.getValue();
			System.out.println("Employee "+key+" info : ");
			System.out.println(e.empName+" | "+e.empId+" | "+e.dept);
		}

	}

}
