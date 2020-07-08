package com.qa.single_responsibility;

public class Car {
	private String colour;
	private String model;
	private int mileage;
	private boolean serviceDue = false;

	// constructor
	public Car(String colour, String model, int mileage) {
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
	}

	public Car(String colour, String model, int mileage, boolean serviceDue) {
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
		this.serviceDue = serviceDue;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public boolean isServiceDue() {
		return serviceDue;
	}

	public void setServiceDue(boolean serviceDue) {
		this.serviceDue = serviceDue;
	}
}
