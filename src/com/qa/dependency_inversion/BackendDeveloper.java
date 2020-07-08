package com.qa.dependency_inversion;

public class BackendDeveloper implements Developer {

	@Override
	public void develop() {
		writeJava();
	}

	private void writeJava() {
		System.out.println("Writing some Java code...");
	}

}
