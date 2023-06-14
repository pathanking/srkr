package oop.abstraction;

public class TestInterfaces {

	public static void main(String[] args) {
		MyInterface myInterface;

		X xx = new X();
		
		Y yy = new Y();
		
		Z zz = new Z();

		myInterface = zz;
		myInterface.print();
	}

}
