package lambdaExpDemo;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {

		// Example 1: Finding the square of a number
		Function<Integer, Integer> f1 = n -> n * n;
		System.out.println(f1.apply(5));
		System.out.println(f1.apply(10));

		// Example 2: Finding the length of a string
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Java"));
		System.out.println(f2.apply("Selenium"));

	}

}
