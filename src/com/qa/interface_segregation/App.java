package com.qa.interface_segregation;

public class App {
	public static void main(String[] args) {
		Dodo walksOffCliffs = new Dodo(4);
		Falcon eatingDodos = new Falcon(27);

		eatingDodos.fly();
		System.out.println(eatingDodos.getCurrentLocation());

		walksOffCliffs.goExtinct();
		System.out.println(walksOffCliffs.getCurrentLocation());
	}
}
