package collections2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<Emp, Integer> map = new TreeMap<>(Comparator.comparing(Emp::getSalary));

		Emp e1 = new Emp(110, "john", 4500.0);
		Emp e2 = new Emp(210, "zain", 7500.0);
		Emp e3 = new Emp(910, "salman", 8500.0);
		Emp e4 = new Emp(810, "mahesh", 9500.0);
		Emp e5 = new Emp(710, "surya", 3500.0);
		Emp e6 = new Emp(610, "aamir", 2500.0);
		Emp e7 = new Emp(210, "imran", 1500.0);
		Emp e8 = new Emp(510, "zara", 6500.0);
		Emp e9 = new Emp(110, "zoya", 5500.0);
		Emp e10 = new Emp(410, "neha", 4200.0);
		Emp e11 = new Emp(310, "kumar", 3500.0);

		map.put(e1, 10);
		map.put(e2, 11);
		map.put(e3, 2);
		map.put(e4, 3);
		map.put(e5, 1);
		map.put(e6, 5);
		map.put(e7, 6);
		map.put(e8, 8);
		map.put(e9, 7);
		map.put(e10, 4);
		map.put(e11, 9);

		map.forEach((key, value) -> {
			System.out.println(key + "  ===>  " + value);
		});

		/*
		 * for (Map.Entry<Emp, Integer> entry : map.entrySet()) { Emp key =
		 * entry.getKey(); Integer val = entry.getValue(); System.out.println(key +
		 * " --> " + val); }
		 */
	}
}
