package finalKeywordDemo;

public class FinalMethod extends SuperClass{

	public static void main(String[] args) {
		
		FinalMethod obj1 = new FinalMethod();
		
		obj1.name();
		
		obj1.address();
		
		obj1.contact();
		
	}
	
	public void address() {
		
		System.out.println("Address is Bangalore");
		
	}

	public void contact() {
		
		System.out.println("Contact number is 9876543210");
		
	}
}
