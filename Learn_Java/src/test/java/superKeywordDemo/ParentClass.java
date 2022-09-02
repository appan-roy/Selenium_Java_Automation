package superKeywordDemo;

public class ParentClass {

	int intRate = 8;
	
	public void RBIIntRate() {
		
		System.out.println("The RBI interest rate is " + intRate);
		
	}
	
	public void bankName() {
		
		System.out.println("The bank name is RBI");
		
	}
	
	public ParentClass() {
		
		System.out.println("This is Reserve Bank of India !!");
		
	}
	
	public ParentClass(String name) {
		
		System.out.println("Parent class " + name + " Bank !!");
		
	}
	
}
