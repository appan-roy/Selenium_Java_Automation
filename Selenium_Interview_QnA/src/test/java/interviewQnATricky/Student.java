package interviewQnATricky;

public class Student {

	private String name;
	private int roll;
	private int marks;
	private int age;
	
	public Student(String name, int roll, int marks, int age) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}

	public int getMarks() {
		return marks;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", roll=" + roll + ", marks=" + marks + ", age=" + age + "]";
	}

}
