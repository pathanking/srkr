package oop.abstraction;

public abstract class Student {

	int studId;
	String name;

	Student(int studId, String name) {
		this.studId = studId;
		this.name = name;
	}

	abstract void study();
}
