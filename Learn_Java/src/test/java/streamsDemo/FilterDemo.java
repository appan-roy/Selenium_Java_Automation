package streamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40);
		List<Integer> evenList = new ArrayList<Integer>();

		// Scenario 1: Print all the even numbers from the list
		// Method 1
		evenList = numList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println("------------------------------------");

		// Method 2
		numList.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
		System.out.println("------------------------------------");

		// Method 3
		numList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println("------------------------------------");

		// Scenario 2: Print all the names of length 6 to 8 characters from the list
		List<String> names = Arrays.asList("Teja", "Trupti", "Ritika", "Shivani", "Ravi", "Chandra", "Nandini",
				"Sagar");

		names.stream().filter(str -> str.length() >= 6 & str.length() <= 8).forEach(str -> System.out.println(str));
		System.out.println("------------------------------------");
		names.stream().filter(str -> str.length() >= 6 & str.length() <= 8).forEach(System.out::println);
		System.out.println("------------------------------------");

	}

}
