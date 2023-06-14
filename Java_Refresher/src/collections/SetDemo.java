package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> strings = new HashSet<>();
		
		strings.add("hello");
		strings.add("hello");
		strings.add("hello");
		strings.add("how");
		strings.add("you");
		strings.add(null);
		
		System.out.println(strings);
		
		Set<Integer> integers = new LinkedHashSet<>();
		integers.add(2);
		integers.add(20);
		integers.add(200);
		integers.add(2000);
		integers.add(2);
		
		System.out.println("integers size : "+integers.size());
		System.out.println(integers);
		
		Set<String> strings2 = new TreeSet<>();
		strings2.add("zeba");
		strings2.add("neha");
		strings2.add("hema");
		strings2.add("sonu");
		strings2.add("nisha");
		strings2.add("yasmin");
		strings2.add("samrin");
		strings2.add("ayesha");
		
		System.out.println(strings2);
	}
}