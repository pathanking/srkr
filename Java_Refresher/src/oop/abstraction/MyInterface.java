package oop.abstraction;

public interface MyInterface {
	public abstract void print();
}

class X implements MyInterface {
	@Override
	public void print() {
		System.out.println("print from X");
	}
}

class Y implements MyInterface {
	@Override
	public void print() {
		System.out.println("print from Y");
	}
}

class Z implements MyInterface {
	@Override
	public void print() {
		System.out.println("print from Z");
	}
}
