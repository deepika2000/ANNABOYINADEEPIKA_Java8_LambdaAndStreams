package com.epam;

public class ConstructionCost {

	public int stdmaterial(int area) {
		return area*1200;
	}

	public int abstdmaterial(int area) {
		return area*1500;
	}

	public int hstdmaterial(int area) {
		return area*1800;
	}

	public int fullauto(int area) {
		return area*2500;
	}
}