package com.qa.dependency_inversion;

public class FrontendDeveloper implements Developer {

	@Override
	public void develop() {
		writeJavascript();
	}

	private void writeJavascript() {
		System.out.println("Writing JS for the web...");
	}

}
