package finalKeywordDemo;

public class FinalClass {

	final int CREATOR;
	
	public FinalClass(int x) {
		
		CREATOR = x;
		
	}
	
	public void showCount() {
		
		System.out.println("Total numbers are " + CREATOR);
		
	}
	
	public static void main(String[] args) {
		
		FinalClass obj1 = new FinalClass(5);
		
		obj1.showCount();
		
	}
	
}
