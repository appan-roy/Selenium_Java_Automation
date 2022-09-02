package streamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {

	String name;
	int roll;
	char grade;

	public Student(String name, int roll, char grade) {
		this.name = name;
		this.roll = roll;
		this.grade = grade;
	}

}

public class FlatMapDemo2 {

	public static void main(String[] args) {

		// Scenario: Find the students who got highest grade 'A'
		List<Student> sList1 = new ArrayList<Student>();
		sList1.add(new Student("Marie", 1, 'B'));
		sList1.add(new Student("John", 2, 'C'));
		sList1.add(new Student("Katie", 3, 'A'));
		sList1.add(new Student("Jack", 4, 'C'));
		sList1.add(new Student("Angelina", 5, 'B'));

		List<Student> sList2 = new ArrayList<Student>();
		sList2.add(new Student("Maria", 6, 'A'));
		sList2.add(new Student("Jonathan", 7, 'C'));
		sList2.add(new Student("David", 8, 'B'));
		sList2.add(new Student("Trish", 9, 'D'));
		sList2.add(new Student("Stacy", 10, 'c'));

		List<List<Student>> sList = Arrays.asList(sList1, sList2);

		List<String> names = sList.stream().flatMap(s -> s.stream()).filter(s -> s.grade == 'A').map(s -> s.name)
				.collect(Collectors.toList());
		System.out.println(names);

	}

}
