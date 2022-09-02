package interviewQnATricky;

public class PrintOneToHundredWithoutNumbers {

	public static void main(String[] args) {
		
		/*
		 * Print 1 to 100 without using any numbers
		 */
		
		// Method 1
		int one = 'A'/'A';	// 1
		String str = "**********";	// length = 10
		
		for(int i = one; i <= str.length()*str.length(); i++) {
			System.out.print(i+",");
		}
		System.out.println();
		
		// Method 2
		for(int i = one; i <= 'd'; i++) {
			System.out.print(i+",");
		}

	}

}
