package collections2;

import java.util.HashSet;
import java.util.Set;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("hii");
		set.add("okk");
		set.add("okk");
		set.add("okk");
		set.add(null);
		set.add(null);

		System.out.println(set);
		System.out.println("set size : " + set.size());
	}
}
