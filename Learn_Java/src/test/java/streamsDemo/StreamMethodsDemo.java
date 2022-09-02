package streamsDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsDemo {

	public static void main(String[] args) {

		// Scenario 1: Integer sorting
		List<Integer> numList = Arrays.asList(3, 6, 2, 9, 1, 10, 5, 4, 7, 8);

		List<Integer> sortedList = numList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		List<Integer> reverseSortedList = numList.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverseSortedList);

		// Scenario 2: String sorting
		List<String> nameList = Arrays.asList("Joanna", "Olavo", "Hema", "Sudheer", "Amir");

		List<String> sortedList1 = nameList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList1);

		List<String> reverseSortedList1 = nameList.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverseSortedList1);

		// Scenario 3: Match methods
		Set<String> fruits = new HashSet<String>();
		fruits.add("Two mangoes");
		fruits.add("One apple");
		fruits.add("One cherry");
		fruits.add("Three mangoes");
		fruits.add("Two cherries");

		// anyMatch()
		boolean result = fruits.stream().anyMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);

		// allMatch()
		result = fruits.stream().allMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);

		// noneMatch()
		result = fruits.stream().noneMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);

		// Scenario 4: Find methods

		// findAny()
		Optional<String> ele = nameList.stream().findAny();
		System.out.println(ele.get());

		// findFirst()
		ele = nameList.stream().findFirst();
		System.out.println(ele.get());

		// Scenario 5: Concatenation
		List<String> list1 = Arrays.asList("Joanna", "Olavo", "Hema", "Sudheer", "Amir");
		List<String> list2 = Arrays.asList("Chandra", "Shivani", "Teja", "Nandini", "Ravi");

		Stream<String> s1 = list1.stream();
		Stream<String> s2 = list2.stream();

		List<String> finalList = Stream.concat(s1, s2).collect(Collectors.toList());
		System.out.println(finalList);

	}

}
