package streamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {

		// Example 1
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<Integer> list3 = Arrays.asList(5, 6);

		List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
		List<Integer> resultList = finalList.stream().flatMap(x -> x.stream().map(n -> n + 10))
				.collect(Collectors.toList());
		System.out.println(resultList);

		// Example 2
		List<String> teamA = Arrays.asList("Scott", "John", "David");
		List<String> teamB = Arrays.asList("Jofra", "Arthur", "Nathan");
		List<String> teamC = Arrays.asList("Jake", "Sergio", "Jonathan");

		List<List<String>> teamList = new ArrayList<List<String>>();
		teamList.add(teamA);
		teamList.add(teamB);
		teamList.add(teamC);

		List<String> worldCupPlayers = teamList.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
		System.out.println(worldCupPlayers);

	}

}
