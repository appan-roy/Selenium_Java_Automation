package interviewQnATricky;

/*
 * WAP to wite the first character and append with its continuous occurence count and so on.
 * E.g.,  000110110001110 -> here 0 occurs 3 times (03), then 1 occurs twice (12) and so on. The o/p = 03120112031301
 */

public class DigitOccurencesInString {

	public static void main(String[] args) {

		String str = "000110110001110";
		int counter;

		for (int i = 0; i < str.length(); i += counter + 1) {

			counter = 0;

			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j))
					counter++;
				else
					break;

			}

			System.out.print(str.charAt(i) + String.valueOf(counter + 1) + " ");

		}

	}

}
