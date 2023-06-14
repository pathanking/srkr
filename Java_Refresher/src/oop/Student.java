package oop;

public class Student {
	// fields OR properties OR attributes
	int id;
	String name;

	//methods
	void attendSession() {
		System.out.println(name + " attends session!");
	}

	void sitInExams() {
		System.out.println(name + " will appear in exams!");
	}

	void showStudentDetails() {
		System.out.println("Student ID : " + id);
		System.out.println("Student Name : " + name);
	}
}
