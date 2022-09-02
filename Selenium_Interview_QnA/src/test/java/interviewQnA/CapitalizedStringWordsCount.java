package interviewQnA;

public class CapitalizedStringWordsCount {

	public static void main(String[] args) {

		String str = "SeleniumJavaCucumberFramework";

		// Method 1
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				counter++;
		}
		System.out.println(counter);

		// Method 2
		int counter1 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
				counter1++;
		}
		System.out.println(counter1);
		
		// Method 3
		int counter2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i)))
				counter2++;
		}
		System.out.println(counter2);

	}

}
