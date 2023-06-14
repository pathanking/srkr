package oop.abstraction;

public interface BInterface {
	public static final double PI = 3.14;

	void foo();

	public default void doSomething() {
		System.out.println("do something....");
	}

	public static void fooBar() {
		System.out.println("foo bar...");
	}
}
