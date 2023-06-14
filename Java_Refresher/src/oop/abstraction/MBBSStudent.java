package oop.abstraction;

public class MBBSStudent extends Student {

	String subject;

	MBBSStudent(int studId, String name, String subject) {
		super(studId, name);
		this.subject = subject;
	}

	@Override
	void study() {
		System.out.println(getClass().getSimpleName() + " " + name + " studies " + subject);
	}
}
