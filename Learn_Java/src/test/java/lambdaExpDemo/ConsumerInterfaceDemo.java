package lambdaExpDemo;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee2 {

	String empName;
	double empSalary;
	String empGender;

	public Employee2(String ename, double sal, String gender) {
		this.empName = ename;
		this.empSalary = sal;
		this.empGender = gender;
	}

}

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee2> empList = new ArrayList<Employee2>();
		empList.add(new Employee2("John", 20000, "Male"));
		empList.add(new Employee2("David", 10000, "Male"));
		empList.add(new Employee2("Stacy", 30000, "Female"));
		empList.add(new Employee2("Jimmy", 50000, "Male"));
		empList.add(new Employee2("Lucy", 40000, "Female"));
		
		// Function Interface
		Function<Employee2, Double> f = emp -> (emp.empSalary * 10) / 100;
		
		// Predicate Interface
		Predicate<Double> p = b -> b > 2000;
		
		// Consumer Interface
		Consumer<Employee2> c = emp -> {
			System.out.println(emp.empName);
			System.out.println(emp.empSalary);
			System.out.println(emp.empGender);
		};
		
		for (Employee2 emp2 : empList) {
			double bonus = f.apply(emp2);	// invoke Function
			if(p.test(bonus)) {				// invoke Predicate
				c.accept(emp2);				// invoke Consumer
				System.out.println("Employee bonus: "+bonus);
			}
		}
		
	}

}
