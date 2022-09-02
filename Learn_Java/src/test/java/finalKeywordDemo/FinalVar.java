package finalKeywordDemo;

public class FinalVar {

	// Blank final variable can be initialized only in a constructor.
	final String PANCARD;
	
	public FinalVar(String pancard) {
		
		PANCARD = pancard;
		
	}
	
	public static void main(String[] args) {
		
		FinalVar obj1 = new FinalVar("ISTQB1234P");
		
		obj1.show();

	}
	
	public void show() {
		
		System.out.println("The PAN is " + PANCARD);
		
	}

}
