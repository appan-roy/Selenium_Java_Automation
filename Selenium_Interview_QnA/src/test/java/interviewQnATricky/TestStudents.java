package interviewQnATricky;

import java.util.ArrayList;
import java.util.List;

public class TestStudents {

	public static void main(String[] args) {

		Student s1 = new Student("John", 1, 90, 14);
		Student s2 = new Student("Jill", 2, 80, 15);
		Student s3 = new Student("Jack", 3, 60, 14);
		Student s4 = new Student("Johanna", 4, 85, 16);
		Student s5 = new Student("Jake", 5, 75, 15);

		List<Student> student_list = new ArrayList<Student>();
		student_list.add(s1);
		student_list.add(s2);
		student_list.add(s3);
		student_list.add(s4);
		student_list.add(s5);

		// get total students
		System.out.println("Total students : " + student_list.size());

		// iterate all the students
		for (Student student : student_list) {
			System.out.println(student);
		}

		// iterate all the students using streams
		student_list.stream().forEach(e -> 
			System.out.println(e)
		);

		// name where marks > 80
		student_list.stream().filter(e -> e.getMarks() > 80).forEach(e -> 
			System.out.println(e.getName() + " : " + e.getMarks())
		);
		
		// who got highest marks
		int highest_marks = student_list
								.stream()
									.map(e -> e.getMarks())
										.max(Integer :: compare)
											.get();
		
		student_list
			.stream()
				.filter(e -> e.getMarks() == highest_marks)
					.forEach(e -> System.out.println(e));

	}

}
