package streamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {

	public static void main(String[] args) {

		// Non terminal / processing methods
		// filter()
		// map()
		// flatMap()
		// distinct()
		// limit()

		// Terminal methods
		// collect()
		// count()
		// forEach()
		// min()
		// max()
		// toArray()

		// Scenario 1
		List<String> colors = Arrays.asList("Red", "Yellow", "Violet", "Green", "Red", "Orange", "Violet", "Yellow",
				"Red", "Black");

		// distinct() - Method 1
		List<String> distinct = colors.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		System.out.println("------------------------------");

		// distinct() - Method 2
		colors.stream().distinct().forEach(System.out::println);
		System.out.println("------------------------------");

		// count()
		long count = colors.stream().distinct().count();
		System.out.println(count);
		System.out.println("------------------------------");

		// limit()
		colors.stream().limit(3).forEach(System.out::println);
		System.out.println("------------------------------");
		colors.stream().distinct().limit(3).forEach(System.out::println);
		System.out.println("------------------------------");

		// Scenario 2
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// count()
		long evenNum = numList.stream().filter(n -> n % 2 == 0).count();
		System.out.println(evenNum);
		System.out.println("------------------------------");

		// min()
		Optional<Integer> min = numList.stream().min((num1, num2) -> {
			return num1.compareTo(num2);
		});
		System.out.println(min.get());
		System.out.println("------------------------------");

		// max()
		Optional<Integer> max = numList.stream().max((num1, num2) -> {
			return num1.compareTo(num2);
		});
		System.out.println(max.get());
		System.out.println("------------------------------");

		// toArray()
		Object[] num = numList.stream().toArray();
		for (Object object : num) {
			System.out.println(object);
		}

	}

}
