package lambdaExpDemo;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String empName;
	double empSalary;
	int empExperience;

	public Employee(String name, double sal, int exp) {
		empName = name;
		empSalary = sal;
		empExperience = exp;
	}

}

public class PredicateInterfaceDemo2 {

	public static void main(String[] args) {

		// To check all the employees who has salary > 30000 and experience > 3

		// Example 1: Single employee check
		Employee emp = new Employee("John", 50000, 5);
		Predicate<Employee> p1 = e -> (e.empSalary > 30000 & e.empExperience > 3);
		System.out.println(p1.test(emp));

		// Example 2: Multiple employee check
		ArrayList<Employee> aList = new ArrayList<Employee>();
		aList.add(new Employee("David", 27000, 4));
		aList.add(new Employee("Jason", 30000, 7));
		aList.add(new Employee("Scott", 40000, 4));
		aList.add(new Employee("Nathan", 45000, 3));
		aList.add(new Employee("Adam", 40000, 5));

		for (Employee employee : aList) {
			if (p1.test(employee))
				System.out.println(employee.empName);
		}

	}

}
