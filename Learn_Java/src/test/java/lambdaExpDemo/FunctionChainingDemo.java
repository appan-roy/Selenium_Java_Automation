package lambdaExpDemo;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {

		Function<Integer, Integer> fn1 = n -> 2 * n;
		Function<Integer, Integer> fn2 = n -> n * n;

		// andThen(): It executes the chained functions in sequential order
		System.out.println(fn1.andThen(fn2).apply(3));

		// compose(): It executes the chained functions in reversed order
		System.out.println(fn1.compose(fn2).apply(3));

	}

}
