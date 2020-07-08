package com.qa.liskov_substitution;

public class App {
	public static void main(String[] args) {
		Dog joey = new Dog("salmon");
		Cat willow = new Cat("chicken");

		Animal.GiveTreatTo(joey);
		Animal.GiveTreatTo(willow);
	}
}
