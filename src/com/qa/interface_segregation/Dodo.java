package com.qa.interface_segregation;

public class Dodo implements EggLayingCreature, ExtinctCreature, LocationModifiable {
	private String currentLocation;
	private int numberOfEggs;

	public Dodo(int initialEggCount) {
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

	@Override
	public void goExtinct() {
		this.setCurrentLocation("Museum shelf 3");
	}
}
