package oop.abstraction;

public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
		System.out.println("Big Fishes must hunt to survive!");
	}

	@Override
	public void flee() {
		System.out.println("Small Fishes must flee to survive!");
	}
}
