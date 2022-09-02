package interviewQnA;

import java.util.Arrays;

public class ArraySearching {

	public static void main(String[] args) {

		int[] arr = { 66, 33, 99, 11, 77, 88, 55, 44, 22 };
		int num = 55;
		boolean flag = false;

		// Sorting the array
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + ",");
		}

		// Method 1 - Linear Search
		int pos = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				flag = true;
				pos = i + 1;
				break;
			}
		}

		if (flag)
			System.out.println("\n" + "The num is present at " + pos + " position");
		else
			System.out.println("\n" + "The num is not present");

		// Method 2 - Binary search
		int beg = 0, end = arr.length - 1, mid = 0;

		for (int i = 0; i < arr.length; i++) {
			mid = (beg + end) / 2;
			if (num > arr[mid])
				beg = mid + 1;
			else if (num < arr[mid])
				end = mid - 1;
			else {
				flag = true;
				break;
			}
		}

		if (flag)
			System.out.println("The num is present at " + (mid + 1) + " position");
		else
			System.out.println("The num is not present");

	}
}
