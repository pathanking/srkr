package functional;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LambdaDemo {
	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction = (s1, s2) -> s1 + "-" + s2;

		String result = biFunction.apply("hello", "world");

		System.out.println(result);

		Predicate<Integer> predicate =
				n -> n % 2 == 1;

		System.out.println(predicate.test(10));

		BiFunction<Integer, Integer, Integer> biFunction2 = 
				(a, b) -> a + b;

		System.out.println("Lambda Expression : "+
		biFunction2.apply(2, 5));
		
		BiFunction<Integer, Integer, Integer> biFunction3 = 
				Integer::sum;
				
		System.out.println("Method Reference : "+
		biFunction3.apply(2, 5));
	}
}
