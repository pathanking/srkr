package lambdastreamapi;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaDemo {
	public static void main(String[] args) {
		int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i : integers) {
			if (i % 2 == 0)
				sum += i * i;
		}

		System.out.println("Sum of Even Numbers : " + sum);

		System.out.println(
				"Sum of Even Numbers[F]: " + IntStream.of(integers).filter(x -> x % 2 == 0).map(n -> n * n).sum());

		String[] strings = { "hi", "you", "me", "hey", "too", "see" };

		Stream.of(strings).filter(str -> str.startsWith("h")).map(s -> s.toUpperCase()).forEach(System.out::println);

		Predicate<String> predicate = (String string) -> string.isBlank();

		System.out.println(predicate.test("abc"));

		Function<String, Integer> function = s -> s.length();

		System.out.println("Length : " +function.apply("hello"));
		
		Function<String, Integer> function2 = String::length;
		System.out.println("Length : " +function2.apply("hello"));
	}
}
