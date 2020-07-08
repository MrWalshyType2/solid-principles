package com.qa.interface_segregation;

public class Falcon implements EggLayingCreature, FlyingCreature, LocationModifiable {
	private String currentLocation;
	private int numberOfEggs;

	public Falcon(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}

	@Override
	public String getCurrentLocation() {
		return this.currentLocation;
	}

	@Override
	public void setCurrentLocation(String location) {
		this.currentLocation = location;
	}

	@Override
	public void fly() {
		this.setCurrentLocation("Cloud nine");
	}

	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);
	}

	@Override
	public int getNumberOfEggs() {
		return this.numberOfEggs;
	}

	@Override
	public void setNumberOfEggs(int eggs) {
		this.numberOfEggs = eggs;
	}
}
