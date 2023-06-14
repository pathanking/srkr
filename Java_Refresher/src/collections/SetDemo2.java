package collections;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
	public static void main(String[] args) {
		Set<Student> students = new TreeSet<Student>();

		Student s1 = new Student(110, "john");
		Student s2 = new Student(109, "mark");
		Student s3 = new Student(104, "joe");
		Student s4 = new Student(106, "sai");
		Student s5 = new Student(107, "surya");
		Student s6 = new Student(105, "vamsi");
		Student s7 = new Student(103, "rama");
		Student s8 = new Student(102, "zain");
		Student s9 = new Student(101, "amit");

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);

		students.forEach(System.out::println);
	}
}

class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}
}
