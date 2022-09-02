package streamsDemo;

import java.util.Arrays;
import java.util.List;

class Students {

	String name;
	int score;

	public Students(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

}

public class ParallelStreamDemo {

	public static void main(String[] args) {

		// Scenario: To print all the student's name with score who scored 80% or higher
		List<Students> studList = Arrays.asList(new Students("Mark", 75), new Students("Katie", 84),
				new Students("Jennifer", 62), new Students("David", 70), new Students("Lisa", 89),
				new Students("John", 64), new Students("Kim", 90), new Students("Trish", 83), new Students("Jake", 97),
				new Students("Marie", 67));

		// using sequential stream
		studList.stream().filter(s -> s.getScore() >= 80).limit(3)
				.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));
		System.out.println("------------------------------------");

		// using parallel stream
		studList.parallelStream().filter(s -> s.getScore() >= 80).limit(3)
				.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));
		System.out.println("------------------------------------");

		// using sequential to parallel stream
		studList.stream().parallel().filter(s -> s.getScore() >= 80).limit(3)
				.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));
		System.out.println("------------------------------------");

	}

}
