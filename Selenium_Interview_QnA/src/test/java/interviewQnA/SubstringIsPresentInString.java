package interviewQnA;

public class SubstringIsPresentInString {

	public static void main(String[] args) {
		
		String str = "Selenium Java Cucumber Framework";
		String subStr = "Cucumber";
		
		// Method 1
		System.out.println(str.matches("(.*)"+subStr+"(.*)"));
		
		// Method 2
		System.out.println(str.contains(subStr));
		
		// Method 3
		System.out.println(str.indexOf(subStr) != -1);

	}

}
