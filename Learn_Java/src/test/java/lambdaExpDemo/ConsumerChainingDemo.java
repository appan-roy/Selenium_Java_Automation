package lambdaExpDemo;

import java.util.function.Consumer;

public class ConsumerChainingDemo {

	public static void main(String[] args) {
		
		Consumer<String> c1 = s -> System.out.println(s+" is white");
		Consumer<String> c2 = s -> System.out.println(s+" has four legs");
		Consumer<String> c3 = s -> System.out.println(s+" gives us milk");
		
		// 1: chaining process
		c1.andThen(c2).andThen(c3).accept("Cow");
		
		// 2: chaining consumer
		Consumer<String> c4 = c1.andThen(c2).andThen(c3);
		c4.accept("Cow");

	}

}
