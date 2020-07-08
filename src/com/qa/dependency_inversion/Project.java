package com.qa.dependency_inversion;

import java.util.List;

public class Project {
	private List<Developer> developers;

	public Project(List<Developer> developers) {
		this.developers = developers;
	}

	public void implementDevs() {
		developers.forEach(dev -> dev.develop());
	}
}
