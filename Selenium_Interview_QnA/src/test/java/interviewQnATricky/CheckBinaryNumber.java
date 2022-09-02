package interviewQnATricky;

public class CheckBinaryNumber {
	
	public static void main(String[] args) {
		
		// 1
		isBin(1011);
		isBin(2011);
		isBin(0);
		isBin(1);
		isBin(1011001010);
		System.out.println("----------------------");
		
		// 2
		isBinary(1011);
		isBinary(2011);
		isBinary(0);
		isBinary(1);
		isBinary(1011001010);
	}
	
	public static void isBin(long num) {
		if(String.valueOf(num).matches("[0-1]+"))	// + is used for multiple digits
			System.out.println("The number is a binary number");
		else
			System.out.println("The number is not a binary number");
	}
	
	public static void isBinary(long num) {
		try {
			Integer.parseInt(String.valueOf(num), 2);
			System.out.println("The number is a binary number");
		} catch (Exception e) {
			System.out.println("The number is not a binary number");
		}
	}

}
