package collections2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		Set<String> strings = new TreeSet<>();
		strings.add("zeba");
		strings.add("samrin");
		strings.add("ayesha");
		strings.add("fatima");
		strings.add("john");
		strings.add("priya");

		strings.forEach(System.out::println);
	}
}
