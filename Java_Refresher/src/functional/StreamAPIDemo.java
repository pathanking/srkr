package functional;

import java.util.stream.IntStream;

public class StreamAPIDemo {
	public static void main(String[] args) {
		// imperative programming
		int[] ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int sum = 0;

		for (int i : ints) {
			if (i % 2 == 0) {
				sum += i * i;
			}
		}

		System.out.println("Sum of square of even numbers : " + sum);

		// functional programming
		int total = IntStream
				.of(ints)
				.filter(x -> x % 2 == 0)
				.map(n -> n * n)
				.sum();

		System.out.println("Sum of square of even numbers[F] : " + total);
	}
}