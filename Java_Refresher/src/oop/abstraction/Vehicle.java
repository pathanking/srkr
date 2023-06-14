package oop.abstraction;

/**
 * 
 * @author razaa
 *
 */

public abstract class Vehicle {
	abstract void drive();
}

class Bike extends Vehicle {

	@Override
	void drive() {
		System.out.println("driving a " + getClass().getSimpleName());
	}
}

class Car extends Vehicle {

	@Override
	void drive() {
		System.out.println("driving a " + getClass().getSimpleName());
	}
}

class EV extends Vehicle {

	@Override
	void drive() {
		System.out.println("driving a " + getClass().getSimpleName());
	}
}