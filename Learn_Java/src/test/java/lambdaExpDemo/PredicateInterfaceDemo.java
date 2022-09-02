package lambdaExpDemo;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {

		// Example 1: To check whether an integer is greater than 10 or not
		Predicate<Integer> p1 = i -> (i > 10);
		System.out.println(p1.test(20));
		System.out.println(p1.test(10));

		// Example 2: To check whether the length of a string is greater than 5 or not
		Predicate<String> p2 = s -> (s.length() > 5);
		System.out.println(p2.test("Selenium"));
		System.out.println(p2.test("Java"));

		// Example 3: Print array elements whose length is greater than 5
		String[] langs = { "Java", "C", "Python", "Ruby", "Perl" };
		for (String lang : langs) {
			if (p2.test(lang))
				System.out.println(lang);
		}

	}

}
