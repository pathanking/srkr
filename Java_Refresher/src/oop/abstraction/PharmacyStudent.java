package oop.abstraction;

public class PharmacyStudent extends Student {

	String subject;

	PharmacyStudent(int studId, String name, String subject) {
		super(studId, name);
		this.subject = subject;
	}

	@Override
	void study() {
		System.out.println(getClass().getSimpleName() + " studies " + subject);
	}

}
