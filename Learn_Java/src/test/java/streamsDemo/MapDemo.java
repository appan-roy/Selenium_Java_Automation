package streamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {

		// Scenario: Print all the names in upper case
		List<String> names = Arrays.asList("Teja", "Trupti", "Ritika", "Shivani", "Ravi", "Chandra", "Nandini",
				"Sagar");
		List<String> uppercaseNames = new ArrayList<String>();

		// Method 1
		uppercaseNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercaseNames);
		System.out.println("------------------------------------");

		// Method 2
		names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));
		System.out.println("------------------------------------");

		// Method 3
		names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		System.out.println("------------------------------------");

		//

	}

}
