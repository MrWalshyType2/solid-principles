package com.qa.single_responsibility;

public class Driver {
	private int mileage;

	public void drive(int milesDriven, Car car) {
		this.setMileage(this.getMileage() + milesDriven);
		car.setMileage(car.getMileage() + milesDriven);
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}
