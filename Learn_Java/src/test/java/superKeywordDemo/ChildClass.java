package superKeywordDemo;

public class ChildClass extends ParentClass{

	int intRate = 10;
	
	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		
		ChildClass obj1 = new ChildClass("RBI");
		
		obj.HDFCIntRate();
		
		obj.bankName();
		
	}
	
	// Super keyword with variable
	
	public void HDFCIntRate() {
		
		System.out.println("The HDFC interest rate is " + intRate);
		
		System.out.println("The RBI interest rate is " + super.intRate);
		
	}
	
	// Super keyword with method
	
	public void bankName() {
		
		System.out.println("The bank name is HDFC");
		
		super.bankName();
		
	}
	
	public ChildClass() {
		
		System.out.println("This is HDFC Bank !!");
		
	}
	
	// Super keyword with constructor
	
	public ChildClass(String name) {
		
		super(name);
		
		System.out.println("Child class " + name + " Bank !!");
				
	}

}
