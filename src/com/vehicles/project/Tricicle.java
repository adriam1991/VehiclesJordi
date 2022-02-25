package com.vehicles.project;

import java.util.List;

public class Tricicle extends Vehicle {

	public Tricicle(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);

	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addOneWheel(frontWheels);
		addTwoWheels(backWheels);
	}

	public int getNumFrontWheels() {

		return 1;
	}

	public int getNumBackWheels() {

		return 2;
	}

}
