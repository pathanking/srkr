package oop.abstraction;

@FunctionalInterface
public interface MyFunctionalInterface {
	public abstract void print();
}

class TestFunctionalInterfaces {
	public static void main(String[] args) {
		MyFunctionalInterface obj = () -> System.out.println("print from a lambda");
		obj.print();
	}
}