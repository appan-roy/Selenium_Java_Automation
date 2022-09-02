package interviewQnATricky;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * WAP to find the greatest two digit number from consistent fragment of a string
 * Sample 1: S = "50552", here the two digit numbers will be ["50", "05", "55", "52"] as strings and will be [50, 5, 55, 52] as integers.
 * It should return 55 as the greatest one
 * Sample 2: S = "10101", here the two digit numbers will be ["10", "01", "10", "01"] as strings and will be [10, 1, 10, 1] as integers.
 * It should return 10 as the greatest one
 * Sample 3: S = "88", here the two digit numbers will be ["88"] as string and will be [88] as integer. Here only one integer is present.
 * It should return 88 as the greatest one
 */

public class GreatestTwoDigitNumberFromConsistentFragmentOfString {

	public static void main(String[] args) throws IOException {

		System.out.println(findGreatestTwoDigitNum("50552")); // 55
		System.out.println(findGreatestTwoDigitNum("10101")); // 10
		System.out.println(findGreatestTwoDigitNum("88")); // 88

	}

	static int findGreatestTwoDigitNum(String S) {

		List<String> list = new ArrayList<String>();
		List<Integer> intList = new ArrayList<Integer>();

		char[] chArr = S.toCharArray();

		for (int i = 0; i < chArr.length - 1; i++) {
			list.add(String.valueOf(chArr[i]) + String.valueOf(chArr[i + 1]));
		}

		for (String s : list) {
			intList.add(Integer.parseInt(s));
		}

		Collections.sort(intList);

		return intList.get(intList.size() - 1);

	}

}
