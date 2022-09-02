package interviewQnATricky;

public class IntegerComparison {

	public static void main(String[] args) {
		
		// Integer caching allows numbers in the range -128 to 127
		Integer a = 100;
		Integer b = 100;
		
		if(a == b) System.out.println("Both are equal");	// this will print
		else System.out.println("Both are not equal");
		
		Integer x = 200;
		Integer y = 200;
		
		if(x == y) System.out.println("Both are equal");
		else System.out.println("Both are not equal");		// this will print as it comes out of range -128 to 127

	}

}
