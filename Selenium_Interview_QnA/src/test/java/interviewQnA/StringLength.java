package interviewQnA;

public class StringLength {

	public static void main(String[] args) {
		
		String str = "Appan";
		
		// Method 1
		System.out.println(str.toCharArray().length);
		
		// Method 2
		char[] chArr = str.toCharArray();
		int count = 0;
		
		for(char ch : chArr) {
			count++;
		}
		System.out.println(count);
		
	}

}
