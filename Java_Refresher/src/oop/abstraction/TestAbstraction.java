package oop.abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		CSEStudent cseStudent = new CSEStudent(112, "varun", "Java");

		MBBSStudent mbbsStudent = new MBBSStudent(225, "sneha", "Anatomy");

		Student student;

		student = mbbsStudent;
		student.study();
	}
}
