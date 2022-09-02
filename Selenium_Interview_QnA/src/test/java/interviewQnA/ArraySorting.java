package interviewQnA;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		// Integer Array
		int[] intArr = { 67, 34, 89, 12, 76, 9, 26, 54 };
		Arrays.sort(intArr);
		for (int x : intArr)
			System.out.print(x + ", ");
		System.out.println();

		// String array
		String[] strArr = { "Selenium", "Cucumber", "Java", "TestNG", "JUnit", "Maven", "Jenkins", "Git" };
		Arrays.sort(strArr);
		for (String str : strArr)
			System.out.print(str + ", ");
		System.out.println();

		// Bubble sort
		int[] myArr = { 89, 34, 46, 11, 50, 5, 75, 98, 23, 64 };

		for (int i = 0; i < myArr.length; i++) {
			for (int j = 1; j < myArr.length; j++) {
				if (myArr[j - 1] > myArr[j]) {
					int temp = myArr[j - 1];
					myArr[j - 1] = myArr[j];
					myArr[j] = temp;
				}
			}
		}

		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + ", ");
		}

	}

}
