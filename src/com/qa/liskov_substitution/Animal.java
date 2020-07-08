package com.qa.liskov_substitution;

public abstract class Animal {
	public String favouriteFood;

	public Animal(String favouriteFood) {
		this.favouriteFood = favouriteFood;
	}

	public static void GiveTreatTo(Animal animal) {
		String msg = "You fed the " + animal.getClass().getSimpleName() + " some " + animal.favouriteFood;
		System.out.println(msg);
	}
}