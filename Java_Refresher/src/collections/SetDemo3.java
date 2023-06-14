package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
	public static void main(String[] args) {
		Set<Stud> studs = new TreeSet<>(Comparator.comparing(Stud::getAddress));

		Stud s1 = new Stud(110, "sai", "bmvrm");
		Stud s2 = new Stud(101, "john", "hyd");
		Stud s3 = new Stud(109, "doe", "bglr");
		Stud s4 = new Stud(108, "hussen", "delhi");
		Stud s5 = new Stud(107, "rama", "mumbai");
		Stud s6 = new Stud(104, "ramya", "vizag");
		Stud s7 = new Stud(103, "srinu", "chennai");
		Stud s8 = new Stud(102, "priya", "kochi");
		Stud s9 = new Stud(116, "zeba", "kkd");

		studs.add(s1);
		studs.add(s2);
		studs.add(s3);
		studs.add(s4);
		studs.add(s5);
		studs.add(s6);
		studs.add(s7);
		studs.add(s8);
		studs.add(s9);

		studs.forEach(System.out::println);
	}

}

class Stud {
	private Integer studId;
	private String name;
	private String address;

	public Stud(Integer studId, String name, String address) {
		super();
		this.studId = studId;
		this.name = name;
		this.address = address;
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Stud [studId=" + studId + ", name=" + name + ", address=" + address + "]";
	}

}
