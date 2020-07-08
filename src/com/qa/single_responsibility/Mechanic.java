package com.qa.single_responsibility;

public class Mechanic {
	private String name;
	private boolean isWorking = false;

	public Mechanic(String name) {
		super();
		this.name = name;
	}

	public void doService(Car car) {
		this.setWorking(true);
		System.out.println("Working away...");
		System.out.println("Dropping the oil...");
		System.out.println("Changing the filters...");
		System.out.println("New lights...");
		car.setServiceDue(false);
		System.out.println("Finished up pal...");
		this.setWorking(false);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
}
