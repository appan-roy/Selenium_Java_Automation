package interviewQnATricky;

public class PrintHelloWorldWithoutSemicolon {

	public static void main(String[] args) {

		/*
		 * Print Hello World Without Semicolon(;)
		 */

		// Method 1
		if (System.out.printf("Hello World" + "\n") == null) {

		}

		// Method 2
		if (System.out.printf("Hello World" + "\n").equals(null)) {

		}

		// Method 3
		if (System.out.append("Hello World" + "\n") == null) {

		}

		// Method 4
		if (System.out.append("Hello World" + "\n").equals(null)) {

		}

	}

}
