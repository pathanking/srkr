package oop.inheritance;

public class Parent {
	// instance fields
	int i;
	int j;

	Parent() { // parameterless constructor
		i = 2;
		j = 5;
	}

	Parent(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void print() { // instance method
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	}
}

class ConstructorDemo {
	public static void main(String[] args) {
		Parent parent = new Parent(10, 20);
		parent.print();
		Parent parent2 = new Parent(22, 55);
		parent2.print();
	}
}