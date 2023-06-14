package oop.abstraction;

public class CSEStudent extends Student {

	String subject;

	CSEStudent(int studId, String name, String subject) {
		super(studId, name);
		this.subject = subject;
	}

	@Override
	void study() {
		System.out.println(getClass().getSimpleName() + "\t" + name + " studies " + subject);
	}
}
