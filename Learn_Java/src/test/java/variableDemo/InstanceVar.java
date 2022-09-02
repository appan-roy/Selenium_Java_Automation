package variableDemo;

public class InstanceVar {

	int roll;
	
	double marks;
	
	int x = 100;
	
	public InstanceVar(int roll, double marks) {
		
		this.roll = roll;
		
		this.marks = marks;
		
	}
	
	public static void main(String[] args) {
		
		InstanceVar obj1 = new InstanceVar(1, 80.5);
		
		obj1.show();
		
		InstanceVar obj2 = new InstanceVar(2, 85.5);
		
		obj2.show();
		
		InstanceVar obj3 = new InstanceVar(3, 90.5);
		
		obj3.show();

	}
	
	public void show() {
		
		int x = 0;
		
		System.out.println(x);
		
		System.out.println("Roll Num is " + roll + " " + "and marks are " + marks);
		
	}

}
