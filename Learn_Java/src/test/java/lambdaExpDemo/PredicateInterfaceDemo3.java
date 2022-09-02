package lambdaExpDemo;

import java.util.function.Predicate;

// Joining predicates: and, or, negate
// p1 - checks no. is even or not
// p2 - checks no. is greater than or not

public class PredicateInterfaceDemo3 {

	public static void main(String[] args) {

		int[] nums = { 5, 25, 50, 75, 100, 35, 65, 70, 90, 60 };

		Predicate<Integer> p1 = n -> (n % 2 == 0);
		Predicate<Integer> p2 = n -> (n > 50);

		// Even and greater than 50
		System.out.println("The following numbers are even and greater than 50");
		for (int i : nums) {
			if (p1.and(p2).test(i))
				System.out.print(i + ",");
		}
		System.out.println();

		// Either even or greater than 50
		System.out.println("The following numbers are either even or greater than 50");
		for (int i : nums) {
			if (p1.or(p2).test(i))
				System.out.print(i + ",");
		}
		System.out.println();

		// Not even number
		System.out.println("The following numbers are not even");
		for (int i : nums) {
			if (p1.negate().test(i))
				System.out.print(i + ",");
		}
		System.out.println();

		// Not greater than 50
		System.out.println("The following numbers are not greater than 50");
		for (int i : nums) {
			if (p2.negate().test(i))
				System.out.print(i + ",");
		}
		System.out.println();

	}

}
