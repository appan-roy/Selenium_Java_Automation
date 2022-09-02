package interviewQnA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparateNumericsAlphabetsSpecialChars {

	public static void main(String[] args) {

		String str = "SeLeNiUm&Java@2022";

		// METHOD 1
		// separate special chars
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!(((int) ch >= 48 & (int) ch <= 57) | ((int) ch >= 65 & (int) ch <= 90) | ((int) ch >= 97 & (int) ch <= 122))) {
				System.out.print(ch);
			}

		}
		System.out.println();
		// separate numerics
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((int) ch >= 48 & (int) ch <= 57) {
				System.out.print(ch);
			}

		}
		System.out.println();
		// separate alphabets
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (((int) ch >= 65 & (int) ch <= 90) | ((int) ch >= 97 & (int) ch <= 122)) {
				System.out.print(ch);
			}

		}
		System.out.println();

		// METHOD 2
		str = "SeLeNiUm&Java@2022";
		// separate special chars
		System.out.println(str.replaceAll("[a-zA-Z0-9]", ""));
		// separate numerics
		System.out.println(str.replaceAll("[^0-9]", ""));
		// separate alphabets
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		
		// METHOD 3
		// separate special chars
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher(str);
		while(m.find())
			System.out.print(m.group());
		System.out.println();
		// separate numerics
		p = Pattern.compile("[0-9]");
		m = p.matcher(str);
		while(m.find())
			System.out.print(m.group());
		System.out.println();
		// separate alphabets
		p = Pattern.compile("[a-zA-Z]");
		m = p.matcher(str);
		while(m.find())
			System.out.print(m.group());
		System.out.println();

	}

}
