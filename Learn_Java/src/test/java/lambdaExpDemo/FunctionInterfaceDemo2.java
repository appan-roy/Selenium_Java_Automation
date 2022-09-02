package lambdaExpDemo;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1 {

	String empName;
	double empSalary;

	public Employee1(String ename, double sal) {
		this.empName = ename;
		this.empSalary = sal;
	}

}

public class FunctionInterfaceDemo2 {

	public static void main(String[] args) {

		ArrayList<Employee1> empList = new ArrayList<Employee1>();
		empList.add(new Employee1("John", 20000));
		empList.add(new Employee1("David", 10000));
		empList.add(new Employee1("Stacy", 30000));
		empList.add(new Employee1("Jimmy", 50000));
		empList.add(new Employee1("Lucy", 40000));

		// Calculate the bonus of employees based on their salary
		Function<Employee1, Double> fn = e -> {
			if (e.empSalary > 10000 & e.empSalary <= 20000)
				return e.empSalary * 5 / 100;
			else if (e.empSalary > 20000 & e.empSalary <= 30000)
				return e.empSalary * 10 / 100;
			else if (e.empSalary > 30000 & e.empSalary <= 40000)
				return e.empSalary * 15 / 100;
			else
				return e.empSalary * 20 / 100;
		};

		// Print the employees if bonus is greater than 5000
		Predicate<Double> pr = b -> b > 5000;

		for (Employee1 emp1 : empList) {
			double bonus = fn.apply(emp1);
			if (pr.test(bonus)) {
				System.out.println(emp1.empName + "'s salary: " + emp1.empSalary);
				System.out.println(emp1.empName + "'s bonus: " + bonus);
			}
		}

	}

}
