package streamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	int empId;
	String empName;
	double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

}

public class FilterMapDemo {

	public static void main(String[] args) {

		// Scenario: Print all the Employee names whose salary are between 40000 & 50000
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(101, "Carlsen", 50000));
		empList.add(new Employee(156, "Anand", 45000));
		empList.add(new Employee(203, "Kasparov", 40000));
		empList.add(new Employee(307, "Mikhail", 30000));
		empList.add(new Employee(290, "Bobby", 100000));

		List<String> empNames = empList.stream().filter(e -> e.empSalary >= 40000 & e.empSalary <= 50000)
				.map(e -> e.empName).collect(Collectors.toList());
		System.out.println(empNames);

	}

}
