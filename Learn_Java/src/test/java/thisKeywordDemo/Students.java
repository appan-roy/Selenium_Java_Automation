package thisKeywordDemo;

public class Students{

	public Students() {
		
		this("Appan");
		
		System.out.println("Loading students details");
		
	}
	
	public Students(String name) {
		
		this(53);
		
		System.out.println("Student's name is " + name);
		
	}
	
	public Students(int n) {
		
		System.out.println("Student's roll number is " + n);
		
	}

	public void show() {
		
		System.out.println("Students' details has been shown");
		
	}
	public static void main(String[] args) {
		
		Students obj = new Students();
		
		obj.show();

	}

}
