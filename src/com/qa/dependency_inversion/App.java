package com.qa.dependency_inversion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		FrontendDeveloper f1 = new FrontendDeveloper();
		FrontendDeveloper f2 = new FrontendDeveloper();
		BackendDeveloper b1 = new BackendDeveloper();

		List<Developer> devs = Stream.of(f1, f2, b1).collect(Collectors.toList());

		Project project1 = new Project(devs);
		project1.implementDevs();
	}
}
