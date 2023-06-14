package oop.abstraction;

public class TestInterfaces2 {
	public static void main(String[] args) {
		BInterface bInterface;
		Impl1 impl1 = new Impl1();
		Impl2 impl2 = new Impl2();
		
		bInterface = impl1;
		bInterface.foo();
	}
}
