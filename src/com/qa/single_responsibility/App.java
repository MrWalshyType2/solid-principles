package com.qa.single_responsibility;

public class App {
	public static void main(String[] args) {
		Car bmw = new Car("red", "535", 37000, true);
		Driver grognak = new Driver();
		Mechanic dave = new Mechanic("Dave");

		grognak.drive(200, bmw);
		dave.doService(bmw);
	}
}
